package Lab6.task5;

public class Child extends Parent {
    protected String name;

    public Child getInfo() {
        System.out.println("Введите имя пользователя: ");
        do {
            name = sc.nextLine();
        }
        while (name.isEmpty());
        return this;
    }

    public String toString() {
        return "Имя объекта: " + this.name;
    }
}
