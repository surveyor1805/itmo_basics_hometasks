package Lab4.part2;

import java.util.Arrays;

import static Lab4.part1.Methods.arrayCreate;

public class Tasks2 {
    public static void main(String[] args) {
        //point 1
        int[] array = arrayCreate();
        String result = Methods2.checkSorted(array);
        System.out.println(result);

        //point 2
        Methods2.arrayCreateModified();

        //point 3
        int[] original = arrayCreate();
        System.out.println("Массив до изменений: " + Arrays.toString(original));
        int[] result3 = Methods2.arrayReplaceExtreme(original);
        System.out.println("Массив после изменений: " + Arrays.toString(result3));

        //point 4
        int[] newArr = new int[]{1, 2, 3, 1, 2, 4};
        Integer result4 = Methods2.findFirstUnique(newArr);
        System.out.println("(4) Результат поиска уникального значения: " + result4);
    }
}
