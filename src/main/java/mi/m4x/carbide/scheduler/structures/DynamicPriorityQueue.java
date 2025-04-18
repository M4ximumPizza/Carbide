package mi.m4x.carbide.scheduler.structures;

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
 * @author M4ximumpizza
 * @since 1.0.0
 */
public final class DynamicPriorityQueue<E> {

    // Tracks count of tasks in each priority queue (faster than scanning queues)
    private final AtomicIntegerArray taskCount;

    // Lock-free FIFO queues for each priority level
    private final ConcurrentLinkedQueue<E>[] queues;

    // Tracks which queue an element belongs to (constant-time lookup/removal)
    private final ConcurrentHashMap<E, Integer> elementPriorityMap = new ConcurrentHashMap<>();

    /**
     * Initializes the dynamic priority queue with the specified number of levels.
     *
     * @param levels Number of priority levels (0 = highest)
     */
    @SuppressWarnings("unchecked")
    public DynamicPriorityQueue(int levels) {
        this.taskCount = new AtomicIntegerArray(levels);
        this.queues = new ConcurrentLinkedQueue[levels];
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
        validatePriority(priority);
        if (elementPriorityMap.putIfAbsent(element, priority) != null) {
            throw new IllegalArgumentException("Element already in queue");
        }
        queues[priority].add(element);
        taskCount.incrementAndGet(priority);
    }

    /**
     * Atomically changes the priority of an element already in the queue.
     * Not thread-safe for the same element across threads.
     *
     * @param element the element whose priority should change
     * @param newPriority the new priority level
     * @return true if the priority was changed successfully, false otherwise
     */
    public boolean changePriority(E element, int newPriority) {
        validatePriority(newPriority);

        int oldPriority = elementPriorityMap.getOrDefault(element, -1);
        if (oldPriority == -1 || oldPriority == newPriority) return false;

        // Best-effort removal from old queue
        boolean removed = queues[oldPriority].remove(element);
        if (!removed) return false; // Possibly dequeued by another thread

        taskCount.decrementAndGet(oldPriority);

        // Update map after successful removal
        Integer prev = elementPriorityMap.put(element, newPriority);
        if (prev == null || prev != oldPriority) return false;

        queues[newPriority].add(element);
        taskCount.incrementAndGet(newPriority);
        return true;
    }

    /**
     * Dequeues the highest-priority available element.
     *
     * @return the dequeued element or null if all queues are empty
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
     * @return true if the element exists in any queue
     */
    public boolean contains(E element) {
        return elementPriorityMap.containsKey(element);
    }

    /**
     * Removes an element from the queue, if it exists.
     * Safe to call concurrently, but may race with other removals.
     *
     * @param element the element to remove
     */
    public void remove(E element) {
        Integer priority = elementPriorityMap.remove(element);
        if (priority != null) {
            boolean removed = queues[priority].remove(element);
            if (removed) taskCount.decrementAndGet(priority);
        }
    }

    /**
     * Returns the total number of elements in the queue.
     *
     * @return total size
     */
    public int size() {
        return elementPriorityMap.size();
    }

    // Validates priority level bounds
    private void validatePriority(int priority) {
        if (priority < 0 || priority >= queues.length) {
            throw new IllegalArgumentException("Priority out of range: " + priority);
        }
    }
}
