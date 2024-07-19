package Lab11.task1;

public class main1 {
    public static void main(String[] args) {
        //task 1
        for (int i = 0; i < 10; i++) {
            ToHundredThread Thread = new ToHundredThread();
            Thread.start();
        }
    }
}
