package Lab9.point2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionTest {
    public static <T> HashSet<T> getWithoutDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6));
        System.out.println(collection);
        HashSet<Integer> newSet = getWithoutDuplicates(collection);
        System.out.println(newSet);
        List<String> collection2 = new ArrayList<>(Arrays.asList("hello", "hello", "World", "World", "World", "!!!"));
        System.out.println(collection2);
        HashSet<String> newCollection2 = getWithoutDuplicates(collection2);
        System.out.println(newCollection2);
    }
}
