package Lab6.task4;

import java.util.Scanner;

public class Parent {
    protected int someValue;

    public void getSomeValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                someValue = sc.nextInt();
                System.out.println("Переменная главного класса задана.");
                break;
            } else {
                System.out.println("Ошибка ввода. Введите целое число: ");
            }
        }
    }
}
