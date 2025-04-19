package scheduler;

import mi.m4x.carbide.scheduler.executor.ExecutorManager;
import mi.m4x.carbide.scheduler.executor.LockToken;
import mi.m4x.carbide.scheduler.executor.Task;

import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;

public class TestThroughput {

    private static final int NUM_TASKS = 1 << 20;
    private static final int THREADS = Runtime.getRuntime().availableProcessors();

    private static final LongAdder accumulation = new LongAdder();
    private static final long[] latency = new long[NUM_TASKS];

    public static void main(String[] args) {
        final ExecutorManager manager = new ExecutorManager(THREADS);
        final ThreadPoolExecutor pool = new ThreadPoolExecutor(
                THREADS, THREADS, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(),
                new ThreadFactory() {
                    private final ThreadFactory backing = Executors.defaultThreadFactory();
                    public Thread newThread(Runnable r) {
                        Thread t = backing.newThread(r);
                        t.setDaemon(true);
                        t.setPriority(Thread.MAX_PRIORITY);
                        return t;
                    }
                }
        );
        pool.prestartAllCoreThreads();

        long last = System.nanoTime();
        int schedules = 0;

        while (true) {
            if (schedules >= NUM_TASKS) {
                long now = System.nanoTime();
                long sum = 0;
                for (int i = 0; i < NUM_TASKS; i++) {
                    sum += latency[i];
                }

                System.out.printf("Throughput: %.2f rps, Latency: %.2f ns, Acc: %e%n",
                        schedules * 1e9 / (now - last),
                        sum / (double) NUM_TASKS,
                        (double) accumulation.sum());

                schedules = 0;
                last = now;
            }

            final int index = schedules;
            final long start = System.nanoTime();

            pool.execute(new DummyTask(start, index, manager));

            schedules++;
        }
    }

    static class DummyTask implements Task, Runnable {
        private final long startTime;
        private final int latencyIndex;
        private final ExecutorManager manager;

        DummyTask(long startTime, int index, ExecutorManager manager) {
            this.startTime = startTime;
            this.latencyIndex = index;
            this.manager = manager;
        }

        @Override
        public void run() {
            manager.schedule(this); // Schedule first to parallelize
            runDirect();
        }

        public void runDirect() {
            // Avoid volatile write in latency array by masking index
            accumulation.add(ThreadLocalRandom.current().nextInt(10));
            latency[latencyIndex & (latency.length - 1)] = System.nanoTime() - startTime;
        }

        @Override
        public void run(Runnable releaseLocks) {
            runDirect();
            releaseLocks.run();
        }

        @Override
        public void propagateException(Throwable t) {}

        @Override
        public LockToken[] lockTokens() {
            return new LockToken[0];
        }


        @Override
        public int priority() {
            return ThreadLocalRandom.current().nextInt(64);
        }
    }
}
