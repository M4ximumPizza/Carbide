package mi.m4x.carbide.scheduler.executor;

public interface Task {
    void run(Runnable releaseLocks);

    void propagateException(Throwable t);

    LockToken[] lockTokens();

    int priority();
}
