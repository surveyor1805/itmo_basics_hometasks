package Lab4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Methods2 {
    //Метод проверяет отсортирован ли массив по возрастанию
    public static String checkSorted(int[] array) {
        String result = null;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                result = "Please, try again";
                break;
            } else if (i == array.length - 1) {
                result = "OK";
            }
        }
        return result;
    }

    //Метод считывает с клавиатуры длину и значения массива, затем выводит его на экран.
    public static void arrayCreateModified() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите целое число в массив с индексом: [" + i + "]");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    //Метод меняет местами крайние значения массива
    public static int[] arrayReplaceExtreme(int[] array) {
        int first = array[0];
        int last = array[array.length - 1];
        array[array.length - 1] = first;
        array[0] = last;
        return array;
    }

    //Метод возвращает первое уникальное значение из массива
    public static Integer findFirstUnique(int[] array) {
        boolean uniqueFound = false;
        Integer unique = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] != array[j]) {
                        uniqueFound = true;
                        unique = array[i];
                    } else {
                        uniqueFound = false;
                        unique = null;
                        break;
                    }
                }
            }
            if (uniqueFound) {
                return unique;
            }
        }
        return unique;
    }
}
