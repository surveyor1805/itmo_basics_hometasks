package Lab9.point4;

import java.util.Map;
import java.util.Scanner;

public class UserPointCheck {
    public static void pointCheck(Map<User, Integer> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        if (sc.hasNextLine()) {
            String neededUser = sc.nextLine();
            if (map.containsKey(new User(neededUser))) {
                System.out.println("Количество очков у данного пользователя: " + map.get(new User(neededUser)));
            } else {
                System.out.println("Пользователь не найден.");
            }
        }
    }
}
