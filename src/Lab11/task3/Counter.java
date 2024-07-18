package Lab11.task3;

public class Counter implements Runnable {
    int count = 0;

    int createdThread = 0;

    int totalThreads;

    public final Object lock = new Object();

    public Counter(int totalThreads) {
        this.totalThreads = totalThreads;
    }

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
            createdThread++;
            if (createdThread == totalThreads) {
                lock.notify();
            }
        }
    }
}
