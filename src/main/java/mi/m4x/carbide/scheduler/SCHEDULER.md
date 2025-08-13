# scheduler Directory Overview

This folder contains classes and utilities for task scheduling, execution, and concurrency management.

## Files

- `BusyReferenceCounter.java`  
  Manages reference counting for busy resources, helping track active usage.

- `Cancellable.java`  
  Interface for tasks or operations that can be cancelled.

- `CancellationSignaller.java`  
  Utility for signalling cancellation requests to running tasks.

- `ObjectFactory.java`  
  Factory for creating reusable objects, often used in pooling scenarios.

- `package-info.java`  
  Provides package-level documentation and annotations.

## Subfolders

### executor

- `ExecutorManager.java`  
  Coordinates and manages multiple executors for task execution.

- `LockToken.java`  
  Represents a lock token for synchronizing access to shared resources.

- `SimpleTask.java`  
  Basic implementation of a schedulable task.

- `Task.java`  
  Abstract representation of a unit of work to be scheduled and executed.

- `WorkerThread.java`  
  Thread implementation dedicated to executing scheduled tasks.

### structures

- `DynamicPriorityQueue.java`  
  Priority queue supporting dynamic changes in task priorities.

- `ObjectPool.java`  
  Pool for managing reusable objects to optimize resource usage.

### utility

- `Assertions.java`  
  Utility class for runtime assertions and validation.

- `EDFScheduler.java`  
  Implements an Earliest Deadline First (EDF) scheduling algorithm.

- `EDFTask.java`  
  Task representation for use with EDF scheduling.

- `FairScheduler.java`  
  Scheduler that aims to distribute resources fairly among tasks.

- `Late.java`  
  Utility for marking or handling late tasks.

- `SingleAssignmentMap.java`  
  Map structure allowing single assignment per key.

- `WeightedTask.java`  
  Task representation with associated weights for weighted scheduling.

---

Each file and subfolder supports efficient and flexible task scheduling and execution within the project.