package Lab6.task5;

public class Child extends Parent {
    protected String name;

    public void setInfo() {
        System.out.println("Введите имя пользователя: ");
        do {
            name = sc.nextLine();
        }
        while (name.isEmpty());
    }
    public void getInfo() {
        System.out.println("Установлено имя пользователя:");
        System.out.println(name);
    }
}
