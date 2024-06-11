package Lab4.part1;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        //point1
        Methods.oddNumbers(1, 99);

        //point2
        Methods.divisibleByThreeAndFive(1, 100);

        //point3
        boolean result = Methods.checkSum();
        System.out.println("(3) Результат: " + result);

        //point4
        boolean result2 = Methods.checkGreaterValues();
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
