package scheduler;

import mi.m4x.carbide.scheduler.executor.ExecutorManager;
import mi.m4x.carbide.scheduler.executor.LockToken;
import mi.m4x.carbide.scheduler.executor.Task;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;

public class TestThroughput {

    private static final int NUM_TASKS = 1 << 20; // 1M tasks
    private static final int THREADS = Runtime.getRuntime().availableProcessors();
    private static final int BATCH_SIZE = 100_000; // submit tasks in batches

    private static final LongAdder accumulation = new LongAdder();
    private static final long[] latency = new long[NUM_TASKS];

    public static void main(String[] args) throws InterruptedException {
        ExecutorManager manager = new ExecutorManager(THREADS);
        CountDownLatch latch = new CountDownLatch(NUM_TASKS);

        long startTime = System.nanoTime();

        for (int i = 0; i < NUM_TASKS; i++) {
            final int index = i;
            final long taskStart = System.nanoTime();

            // Schedule task using ExecutorManager
            manager.schedule(new Task() {
                @Override
                public void run(Runnable releaseLocks) {
                    accumulation.add(ThreadLocalRandom.current().nextInt(10));
                    latency[index] = System.nanoTime() - taskStart;
                    releaseLocks.run(); // signal Carbide that task is done
                    latch.countDown();
                }

                @Override
                public void propagateException(Throwable t) {}

                @Override
                public LockToken[] lockTokens() {
                    return new LockToken[0]; // no locks needed
                }

                @Override
                public int priority() {
                    return 0; // fixed priority
                }
            });

            // Optional: submit in batches to prevent queue overload
            if ((i + 1) % BATCH_SIZE == 0) {
                System.out.printf("Submitted %d/%d tasks%n", i + 1, NUM_TASKS);
                Thread.sleep(5); // give worker threads a chance to catch up
            }
        }

        // Wait for all tasks to finish
        latch.await();

        long endTime = System.nanoTime();

        // Compute metrics
        long totalLatency = 0;
        for (long l : latency) totalLatency += l;

        double avgLatencyNs = totalLatency / (double) NUM_TASKS;
        double throughput = NUM_TASKS * 1e9 / (endTime - startTime);

        System.out.printf("All tasks completed.%n");
        System.out.printf("Throughput: %.2f rps%n", throughput);
        System.out.printf("Average latency: %.2f ns%n", avgLatencyNs);
        System.out.printf("Accumulation sum: %e%n", (double) accumulation.sum());

        manager.shutdown();
    }
}
