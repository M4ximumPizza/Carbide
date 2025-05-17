package mi.m4x.carbide.scheduler.structures;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * A high-performance concurrent priority queue supporting dynamic re-prioritization.
 *
 * Each element is assigned a priority level from 0 (highest) to N-1 (lowest).
 * Internally, a fixed array of lock-free queues is used, one per priority level.
 *
 * Features:
 * - Fast enqueue and dequeue operations using per-priority queues.
 * - Lock-free design for scalability.
 * - O(1) contains, remove, and size using a concurrent map.
 * - Optional ability to change an element's priority (non-thread-safe for single element).
 *
 * Notes:
 * - Priority must remain immutable or carefully changed using `changePriority()`.
 * - Thread-safe for concurrent enqueues and dequeues, but not for simultaneous
 *   `changePriority()` calls on the same element.
 *
 * @param <E> the type of elements held in this queue
 * @since 1.0.0
 * @author M4ximumpizza
 */
public final class DynamicPriorityQueue<E> {

    private final AtomicIntegerArray taskCount;
    private final ConcurrentLinkedQueue<E>[] queues;
    private final ConcurrentHashMap<E, Integer> elementPriorityMap;

    /**
     * Initializes the dynamic priority queue with the specified number of levels.
     *
     * @param levels Number of priority levels (0 = highest)
     * @throws IllegalArgumentException if levels &lt;= 0
     */
    @SuppressWarnings("unchecked")
    public DynamicPriorityQueue(int levels) {
        if (levels <= 0) throw new IllegalArgumentException("Priority levels must be positive");

        this.taskCount = new AtomicIntegerArray(levels);
        this.queues = new ConcurrentLinkedQueue[levels];
        this.elementPriorityMap = new ConcurrentHashMap<>();

        for (int i = 0; i < levels; i++) {
            queues[i] = new ConcurrentLinkedQueue<>();
        }
    }

    /**
     * Enqueues an element at the given priority level.
     *
     * @param element the item to insert
     * @param priority priority level (0 = highest)
     * @throws IllegalArgumentException if priority is invalid or element already exists
     */
    public void enqueue(E element, int priority) {
        Objects.requireNonNull(element, "Element cannot be null");
        validatePriority(priority);

        if (elementPriorityMap.putIfAbsent(element, priority) != null) {
            throw new IllegalArgumentException("Element already exists in the queue");
        }

        queues[priority].add(element);
        taskCount.incrementAndGet(priority);
    }

    /**
     * Atomically changes the priority of an existing element.
     * Not thread-safe for the same element being modified concurrently.
     *
     * @param element     the element to reprioritize
     * @param newPriority the new priority level
     * @return true if the priority was changed successfully, false otherwise
     */
    public boolean changePriority(E element, int newPriority) {
        Objects.requireNonNull(element, "Element cannot be null");
        validatePriority(newPriority);

        Integer currentPriority = elementPriorityMap.get(element);
        if (currentPriority == null || currentPriority == newPriority) return false;

        boolean removed = queues[currentPriority].remove(element);
        if (!removed) return false;

        taskCount.decrementAndGet(currentPriority);
        elementPriorityMap.put(element, newPriority);

        queues[newPriority].add(element);
        taskCount.incrementAndGet(newPriority);
        return true;
    }

    /**
     * Dequeues the highest-priority available element.
     *
     * @return the dequeued element, or null if all queues are empty
     */
    public E dequeue() {
        for (int i = 0; i < queues.length; i++) {
            if (taskCount.get(i) == 0) continue;

            E element = queues[i].poll();
            if (element != null) {
                taskCount.decrementAndGet(i);
                elementPriorityMap.remove(element);
                return element;
            }
        }
        return null;
    }

    /**
     * Checks if the queue contains the specified element.
     *
     * @param element the element to check
     * @return true if present, false otherwise
     */
    public boolean contains(E element) {
        return elementPriorityMap.containsKey(element);
    }

    /**
     * Removes an element from the queue.
     *
     * @param element the element to remove
     */
    public void remove(E element) {
        Integer priority = elementPriorityMap.remove(element);
        if (priority != null && queues[priority].remove(element)) {
            taskCount.decrementAndGet(priority);
        }
    }

    /**
     * Returns the total number of elements in the queue.
     *
     * @return the total size
     */
    public int size() {
        return elementPriorityMap.size();
    }

    /**
     * Validates that a priority is within bounds.
     *
     * @param priority the priority to check
     * @throws IllegalArgumentException if priority is out of bounds
     */
    private void validatePriority(int priority) {
        if (priority < 0 || priority >= queues.length) {
            throw new IllegalArgumentException("Priority out of range: " + priority);
        }
    }
}
