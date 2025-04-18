# Carbide Scheduler
The section of code collectively implements a **high-performance, priority-based task scheduling and execution framework**. Here's a detailed description of the core functionality and purpose of the system:

---

### **Core Purpose**
The system is designed to manage and execute tasks in a **concurrent, priority-driven environment**. It provides mechanisms for:
1. **Task Scheduling**: Tasks are enqueued with priorities, ensuring higher-priority tasks are executed first.
2. **Lock Coordination**: Tasks can specify dependencies (locks) that must be acquired before execution.
3. **Cancellation and Completion**: Tasks and signals can be cancelled or marked as completed, with support for notifying listeners.
4. **Resource Management**: Includes utilities like object pooling to optimize memory usage and reduce allocation overhead.

---

### **Key Components**
1. **Task Scheduling and Execution**
    - **`ExecutorManager`**: Manages task scheduling and execution using a global priority queue (`DynamicPriorityQueue`). It ensures tasks are executed only when their required locks are available.
    - **`WorkerThread`**: Continuously polls tasks from the queue, executes them, and handles lock acquisition/release.
    - **`Task` Interface**: Represents a unit of work with methods for execution, exception propagation, and lock management.
    - **`SimpleTask`**: A basic implementation of `Task` for tasks without lock dependencies.

2. **Priority Management**
    - **`DynamicPriorityQueue`**: A lock-free, multi-level priority queue that supports dynamic re-prioritization of tasks. It ensures efficient enqueue, dequeue, and priority changes.

3. **Lock Coordination**
    - **`LockToken`**: Represents a lock required by a task.
    - **`ExecutorManager`**: Handles lock acquisition and release, ensuring tasks are executed only when all required locks are available.

4. **Cancellation and Completion**
    - **`CancellationSignaller`**: A thread-safe utility for propagating cancellation signals and notifying listeners upon completion.
    - **`Cancellable`**: A lightweight cancellation token for cooperative task cancellation.

5. **Resource Optimization**
    - **`ObjectPool`**: A high-performance, thread-safe object pool for reusing preallocated instances, reducing garbage collection pressure.

6. **Assertions**
    - **`Assertions`**: Provides lightweight runtime checks for validating conditions during development and debugging.

---

### **Core Workflow**
1. **Task Submission**: Tasks are submitted to the `ExecutorManager` with a priority and optional lock dependencies.
2. **Task Execution**: Worker threads poll tasks from the priority queue, acquire necessary locks, and execute the tasks.
3. **Lock Management**: Locks are acquired before task execution and released afterward, allowing dependent tasks to proceed.
4. **Cancellation and Completion**: Tasks or signals can be cancelled or marked as completed, triggering registered listeners.
5. **Resource Recycling**: Object pooling is used to optimize memory usage in performance-critical paths.

---

### **Use Cases**
- **Concurrent Task Scheduling**: Ideal for systems requiring prioritized task execution, such as job schedulers or game engines.
- **Dependency Management**: Handles inter-task dependencies using locks.
- **High-Performance Applications**: Optimized for low-latency, high-throughput environments with minimal contention.
