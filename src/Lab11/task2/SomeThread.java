package Lab11.task2;

public class SomeThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
