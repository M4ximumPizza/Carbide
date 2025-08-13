/**
 * <h2>Carbide Scheduler</h2>
 *
 * <p>
 * This package implements a <strong>high-performance, priority-based task scheduling and execution framework</strong>.
 * </p>
 *
 * <h2>Core Purpose</h2>
 * <p>
 * The system is designed to manage and execute tasks in a <strong>concurrent, priority-driven environment</strong>. It provides mechanisms for:
 * </p>
 * <ul>
 *   <li><strong>Task Scheduling</strong>: Tasks are enqueued with priorities, ensuring higher-priority tasks are executed first.</li>
 *   <li><strong>Lock Coordination</strong>: Tasks can specify dependencies (locks) that must be acquired before execution.</li>
 *   <li><strong>Cancellation and Completion</strong>: Tasks and signals can be cancelled or marked as completed, with support for notifying listeners.</li>
 *   <li><strong>Resource Management</strong>: Includes utilities like object pooling to optimize memory usage and reduce allocation overhead.</li>
 * </ul>
 *
 * <h2>Key Components</h2>
 * <ul>
 *   <li><strong>Task Scheduling and Execution</strong>
 *     <ul>
 *       <li><code>ExecutorManager</code>: Manages task scheduling and execution using a global priority queue (<code>DynamicPriorityQueue</code>).</li>
 *       <li><code>WorkerThread</code>: Polls and executes tasks, handling lock acquisition and release.</li>
 *       <li><code>Task</code>: Represents a unit of work with execution and lock management logic.</li>
 *       <li><code>SimpleTask</code>: Basic implementation of <code>Task</code> without lock dependencies.</li>
 *       <li><code>BusyReferenceCounter</code>: Tracks active usage of resources for concurrency control.</li>
 *       <li><code>ObjectFactory</code>: Factory for creating reusable objects, often used in pooling scenarios.</li>
 *     </ul>
 *   </li>
 *   <li><strong>Priority Management</strong>
 *     <ul>
 *       <li><code>DynamicPriorityQueue</code>: A lock-free, multi-level priority queue with dynamic re-prioritization.</li>
 *       <li><code>FairScheduler</code>: Distributes resources fairly among tasks.</li>
 *       <li><code>WeightedTask</code>: Task representation with associated weights for weighted scheduling.</li>
 *     </ul>
 *   </li>
 *   <li><strong>Lock Coordination</strong>
 *     <ul>
 *       <li><code>LockToken</code>: Represents a lock required by a task.</li>
 *       <li><code>ExecutorManager</code>: Ensures lock-based execution control.</li>
 *     </ul>
 *   </li>
 *   <li><strong>Cancellation and Completion</strong>
 *     <ul>
 *       <li><code>CancellationSignaller</code>: Propagates cancellation and completion signals to listeners.</li>
 *       <li><code>Cancellable</code>: Interface for cooperative cancellation.</li>
 *       <li><code>Late</code>: Utility for marking or handling late tasks.</li>
 *     </ul>
 *   </li>
 *   <li><strong>Resource Optimization</strong>
 *     <ul>
 *       <li><code>ObjectPool</code>: High-performance, thread-safe object pooling for reduced GC pressure.</li>
 *       <li><code>SingleAssignmentMap</code>: Map structure allowing single assignment per key.</li>
 *     </ul>
 *   </li>
 *   <li><strong>Scheduling Algorithms</strong>
 *     <ul>
 *       <li><code>EDFScheduler</code>: Implements Earliest Deadline First scheduling.</li>
 *       <li><code>EDFTask</code>: Task representation for EDF scheduling.</li>
 *     </ul>
 *   </li>
 *   <li><strong>Assertions</strong>
 *     <ul>
 *       <li><code>Assertions</code>: Lightweight runtime condition checks for debugging and development.</li>
 *     </ul>
 *   </li>
 * </ul>
 *
 * <h2>Core Workflow</h2>
 * <ol>
 *   <li>Tasks are submitted to <code>ExecutorManager</code> with priority and optional lock dependencies.</li>
 *   <li>Worker threads poll tasks, acquire required locks, and execute them.</li>
 *   <li>Locks are acquired and released around execution, coordinating dependent tasks.</li>
 *   <li>Cancellation and completion signals trigger listeners and cleanup logic.</li>
 *   <li>Object pooling and resource management optimize memory and performance.</li>
 * </ol>
 *
 * <h2>Use Cases</h2>
 * <ul>
 *   <li><strong>Concurrent Task Scheduling</strong>: Useful in job schedulers, game engines, or real-time systems.</li>
 *   <li><strong>Dependency Management</strong>: Suitable for tasks requiring strict ordering via lock dependencies.</li>
 *   <li><strong>High-Performance Applications</strong>: Tuned for low-latency, high-throughput execution with minimal contention.</li>
 *   <li><strong>Fair and Deadline-Based Scheduling</strong>: Supports fairness and deadline-driven task execution.</li>
 * </ul>
 *
 * @since 1.0.0
 * @author M4ximumpizza
 */
package mi.m4x.carbide.scheduler;