package Lab11.task2;

public class main2 {
    public static void main(String[] args) {
        //task 2
        SomeThread someThread = new SomeThread();
        System.out.println("Состояние потока до запуска: " + someThread.getState());
        someThread.start();
        System.out.println("Состояние потока после запуска: " + someThread.getState());
        do {
            System.out.println("Состояние потока во время выполнения: " + someThread.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        while (someThread.isAlive());
    }
}
