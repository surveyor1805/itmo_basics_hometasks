package Lab4.part1;

import java.util.Scanner;

public class Methods {
    //Метод выводит на консоль нечетные числа в диапазоне от int a до int b (включительно)
    public static void oddNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Метод выводит на консоль числа в диапазоне от int a до int b (включительно), которые делятся на 3, 5
    public static void divisibleByThreeAndFive(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    //Метод вычисляет сумму первых двух введенных чисел и возвращает boolean true если сумма равна третьему числу
    public static boolean checkSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Введите третье число:");
        int c = sc.nextInt();
        boolean result = false;
        if (a + b == c) {
            result = true;
        }
        return result;
    }

    //Метод заправшивает три числа у пользователя и возвращает boolean true если отношения между чисел: 3 > 2 > 1
    public static boolean checkGreaterValues() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int i = scan.nextInt();
        System.out.println("Введите второе число:");
        int j = scan.nextInt();
        System.out.println("Введите третье число:");
        int k = scan.nextInt();
        boolean res = false;
        if (j > i && k > j) {
            res = true;
        }
        return res;
    }

    //Метод создает массив с длиной >= 2 по введенным данным
    public static int[] arrayCreate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: (>=2)");
        int length = scanner.nextInt();
        while (length < 2) {
            System.out.println("Ошибка. Массив меньше 2");
            System.out.println("Введите длину массива: (>=2)");
            length = scanner.nextInt();
        }
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите целое число в массив с индексом: [" + i + "]");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //Метод проверяет наличие числа 3 в начале или конце массива. При наличии - возвращает boolean true.
    public static boolean checkThreeInBegOrEnd(int[] array) {
        int x = array.length - 1;
        boolean res2 = false;
        if (array[0] == 3 || array[x] == 3) {
            res2 = true;
        }
        return res2;
    }

    //Метод проверяет наличие числа 3 или 1 в массиве. При наличии - возвращает boolean true.
    public static boolean checkOneThreeContained(int[] array) {
        boolean r = false;
        for (int d = 0; d < array.length; d++) {
            if (array[d] == 1 || array[d] == 3) {
                r = true;
                break;
            }
        }
        return r;
    }
}
