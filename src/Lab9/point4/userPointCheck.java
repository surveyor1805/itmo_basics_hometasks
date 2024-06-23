package Lab9.point4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class userPointCheck {
    public static void pointCheck(Map map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        if (sc.hasNextLine()) {
            String neededUser = sc.nextLine();
            User user = new User(neededUser);
            Iterator<User> iterator = map.keySet().iterator();
            boolean userFound = false;
            while (iterator.hasNext()) {
                if (user.getName().equals(iterator.next().getName())) {
                    userFound = true;
                    System.out.println("Количество очков у данного пользователя: " + map.get(iterator.next()));
                    break;
                }
            }
            if (userFound == false) {
                System.out.println("Пользователь не найден.");
            }
        }
    }
}
