package Lab6.task5;

import java.util.Scanner;

public class Parent {
    protected double age;
    protected Scanner sc;

    public Parent() {
        sc = new Scanner(System.in);
    }

    public Parent getInfo() {
        System.out.println("Введите возраст пользователя: ");
        while (sc.hasNext()) {
            if (sc.hasNextDouble()) {
                age = sc.nextDouble();
                break;
            } else {
                System.out.println("Ошибка ввода. Повторите ввод: ");
            }
        }
        return this;
    }

    public String toString() {
        return "Возраст объекта: " + this.age;
    }
}
