package Lab9.point4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapGenerator {
    private Map<User, Integer> map;

    public MapGenerator() {
        this.map = new HashMap<>();
        List<String> names = new ArrayList<>(List.of("Ivan", "Michael", "Jack", "John", "Jim", "Bob", "Bill", "Alex"));
        Random random = new Random(2024);
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            User user = new User(iterator.next());
            map.put(user, random.nextInt(50000));
        }
    }

    public Map<User, Integer> getMap() {
        return map;
    }
}
