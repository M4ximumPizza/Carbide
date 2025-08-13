# Carbide Scheduler

Carbide Scheduler is a high-performance, priority-based task scheduling and execution framework for concurrent Java environments. It provides advanced mechanisms for task management, resource coordination, cancellation, and memory optimization.

---

## Installation

To include Carbide Scheduler in your project, add the following to your Gradle dependencies:

```gradle
implementation 'com.github.M4ximumPizza:Carbide:1.0.4'
```

## Directory Structure & File Descriptions

### Root Files

- **BusyReferenceCounter.java**: Utility for tracking references to shared resources, helping manage resource contention.
- **Cancellable.java**: Lightweight cancellation token for cooperative task cancellation.
- **CancellationSignaller.java**: Thread-safe utility for propagating cancellation signals and notifying listeners.
- **ObjectFactory.java**: Factory interface for creating pooled objects.
- **package-info.java**: Package-level documentation.

---

### executor/

- **ExecutorManager.java**: Central manager for scheduling and executing tasks, handling priorities and lock dependencies.
- **LockToken.java**: Represents a lock required by a task for resource coordination.
- **SimpleTask.java**: Basic implementation of the `Task` interface for tasks without lock dependencies.
- **Task.java**: Interface defining a unit of work, including execution, exception handling, and lock management.
- **WorkerThread.java**: Worker thread that polls tasks from the queue, acquires locks, executes tasks, and releases locks.

---

### structures/

- **DynamicPriorityQueue.java**: Lock-free, multi-level priority queue supporting dynamic re-prioritization of tasks.
- **ObjectPool.java**: High-performance, thread-safe object pool for reusing preallocated instances and reducing memory overhead.

---

### utility/

- **Assertions.java**: Lightweight runtime checks for validating conditions during development and debugging.
- **EDFScheduler.java**: Scheduler implementation using Earliest Deadline First (EDF) algorithm for time-based task prioritization.
- **EDFTask.java**: Task implementation compatible with EDF scheduling, including deadline management.
- **FairScheduler.java**: Scheduler implementation that ensures fair distribution of execution among tasks.
- **Late.java**: Utility for handling late or overdue tasks.
- **SingleAssignmentMap.java**: Map structure allowing single assignment per key, useful for immutable mappings.
- **WeightedTask.java**: Task implementation supporting weighted priorities for more granular scheduling.

---

## Core Workflow

1. **Task Submission**: Submit tasks to `ExecutorManager` with priority and optional lock dependencies.
2. **Task Execution**: Worker threads poll tasks, acquire necessary locks, and execute them.
3. **Lock Management**: Locks are acquired before execution and released afterward, allowing dependent tasks to proceed.
4. **Cancellation and Completion**: Tasks or signals can be cancelled or marked as completed, triggering registered listeners.
5. **Resource Recycling**: Object pooling optimizes memory usage in performance-critical paths.

---

## Use Cases

- Concurrent task scheduling (job schedulers, game engines)
- Dependency management via locks
- High-throughput, low-latency applications

---

## More Information

For more detailed documentation, see [`SCHEDULER.md`](src/main/java/mi/m4x/carbide/scheduler/SCHEDULER.md) and [`natives.md`](src/main/java/mi/m4x/carbide/natives/NATIVES.md).

---

## License

This project is licensed under the GNU LESSER GENERAL PUBLIC LICENSE. See the [LICENSE](LICENSE) file for details.