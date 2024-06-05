package Lab1;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        // item 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        // item 2
        double x = (46 + 10) * (10d / 3);
        int y = 29 * 4 * (-15);
        System.out.println("(2) Результат первого выражения: " + x);
        System.out.println("(2) Результат второго выражения: " + y);

        // item 3
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println("(3) Результат выражения: " + result);

        // item 4
        double i = 3.6;
        double j = 4.1;
        double k = 5.9;
        double res = i * j * k;
        System.out.println("(4) Результат произведения: " + res);

        // item 5
        Scanner sc = new Scanner(System.in);
        System.out.println("(5) Введите 3 целых числа: ");
        int first = sc.nextInt();
        int sec = sc.nextInt();
        int third = sc.nextInt();
        System.out.println("(5) Введены следующие числа: " + first + ", " + sec + ", " + third);

        // item 6
        System.out.println("(6) Введите число b: ");
        int b = sc.nextInt();
        if (b % 2 != 0) {
            System.out.println("(6) Нечетное");
        } else if (b > 100) {
            System.out.println("(6) Выход за пределы диапазона");
        } else {
            System.out.println("(6) Четное");
        }

    }
}
