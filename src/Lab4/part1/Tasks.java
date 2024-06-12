package Lab4.part1;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //point1
        Methods.oddNumbers(1, 99);

        //point2
        Methods.divisibleByThreeAndFive(1, 100);

        //point3
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Введите третье число:");
        int c = sc.nextInt();
        boolean result = Methods.checkSum(a, b, c);
        System.out.println("(3) Результат: " + result);

        //point4
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int i = scan.nextInt();
        System.out.println("Введите второе число:");
        int j = scan.nextInt();
        System.out.println("Введите третье число:");
        int k = scan.nextInt();
        boolean result2 = Methods.checkGreaterValues(i, j, k);
        System.out.println("(4) Результат: " + result2);

        //point 5
        int[] array = Methods.arrayCreate();
        boolean res = Methods.checkThreeInBegOrEnd(array);
        System.out.println("(5) Массив: " + Arrays.toString(array) + "\nРезультат: " + res);

        //point 6
        int[] arr = Methods.arrayCreate();
        boolean r = Methods.checkOneThreeContained(arr);
        System.out.println("(6) Массив содержит число 1 или 3\n" + r);

    }
}
