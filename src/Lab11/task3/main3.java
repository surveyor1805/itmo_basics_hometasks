package Lab11.task3;

public class main3 {
    public static void main(String[] args) {
        int totalThreads = 100;
        Counter counter = new Counter(totalThreads);
        for (int i = 0; i < totalThreads; i++) {
            Thread thread = new Thread(counter);
            thread.start();
        }
        synchronized (counter.lock) {
            try {
                counter.lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(counter.getCount());
        }
    }
}
