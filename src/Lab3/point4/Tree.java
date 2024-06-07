package Lab3.point4;

public class Tree {

    private Integer age;
    private Boolean alive;
    private String treeName;

    public Tree(int age, String treeName) {
        this.age = age;
        this.treeName = treeName;
    }

    public Tree(int age, boolean alive, String treeName) {
        this.age = age;
        this.alive = alive;
        this.treeName = treeName;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

}
