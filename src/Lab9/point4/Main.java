package Lab9.point4;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MapGenerator mapGenerator = new MapGenerator();
        Map map = mapGenerator.getMap();
        userPointCheck.pointCheck(map);
    }
}
