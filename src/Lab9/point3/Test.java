package Lab9.point3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class Test {
    public static List<Integer> millionValuesArrayList() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            result.add(i*2);
        }
        return result;
    }

    public static List<Integer> millionValuesLinkedList() {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            result.add(i*2);
        }
        return result;
    }

    public static int getSomeValue(List<Integer> list) {
        Random randomNumber = new Random();
        return list.get(randomNumber.nextInt(list.size()));
    }

    public static void main(String[] args) {
        List<Integer> newMillionList = millionValuesArrayList();
        long timeStart = currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            getSomeValue(newMillionList);
        }
        long timeFinish = currentTimeMillis();
        long timeSpent = timeFinish - timeStart;
        System.out.println("Время затраченное на выбор случайного элемента 100000 раз из Arraylist: " + timeSpent);
        List<Integer> newMillionLinkedList = millionValuesLinkedList();
        long timeStart2 = currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            getSomeValue(newMillionLinkedList);
        }
        long timeFinish2 = currentTimeMillis();
        long timeSpent2 = timeFinish2 - timeStart2;
        System.out.println("Время затраченное на выбор случайного элемента 100000 раз из LinkedList: " + timeSpent2);

        /*
        Разница в затраченном времени заключается в особенностях работы LinkedList, так как в нем,
        при обращении к какому-либо элементу списка, перебираются по порядку все предшествующие элементы.
        В каждом элементе указана ссылка на следующий и чтобы добраться, условно, до 60 элемента,
        необходимо последовательно обратиться к 59 элементам списка, расположенным до него.
        В ArrayList обращение к элементу осуществляется напрямую через его индекс.
         */
    }
}
