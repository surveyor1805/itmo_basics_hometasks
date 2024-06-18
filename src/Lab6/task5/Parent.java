package Lab6.task5;

import java.util.Scanner;

public class Parent {
    protected double age;
    protected Scanner sc;

    public Parent() {
        sc = new Scanner(System.in);
    }

    public void setInfo() {
        System.out.println("Введите возраст пользователя: ");
        do {
            age = sc.nextDouble();
        }
        while (age == 0);
    }
    public void getInfo() {
        System.out.println("Установлен возраст пользователя:");
        System.out.println(age);
    }
}
