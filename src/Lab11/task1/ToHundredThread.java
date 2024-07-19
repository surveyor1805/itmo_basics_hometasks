package Lab11.task1;

public class ToHundredThread extends Thread {
    @Override
    public void run() {
        System.out.println("Начал работу поток: " + Thread.currentThread().getName());
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Завершил работу поток: " + Thread.currentThread().getName());
    }
}
