package Lab11.task4;

public class infiniteThread extends Thread {

    public final Object lock;

    private final String threadName;

    public infiniteThread(String name, Object lock) {
        this.lock = lock;
        this.threadName = name;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                System.out.println(threadName);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
