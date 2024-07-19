package Lab11.task4;

public class main4 {
    public static void main(String[] args) {
        Object commonLock = new Object();
        infiniteThread thread1 = new infiniteThread("Поток 1", commonLock);
        infiniteThread thread2 = new infiniteThread("Поток 2", commonLock);
        thread1.start();
        thread2.start();
        synchronized (commonLock) {
            try {
                commonLock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
