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
            do {
                age = sc.nextDouble();
            }
            while (age == 0);
        return this;
    }

    public String toString() {
        return "Возраст объекта: " + this.age;
    }
}
