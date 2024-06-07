//HomeTask 3 point 2
package Lab3.point2;

public class CarTest {
    public static void main(String[] args) {
        Car solaris = new Car(Color.WHITE, 5);
        Car BMW = new Car(Color.BLACK, 10);
        System.out.println("Параметры solaris: " + solaris.getAll());
        System.out.println("Параметры BMW: " + BMW.getAll());
    }
}
