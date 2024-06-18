package Lab6.task3;

public class test {
    public static void main(String[] args) {
        Car car = new Car(5,"solaris", 'a', 90.5f);
        Truck truck = new Truck(10, "Kamaz", 'b', 70f, 6, 20);
        car.outPut();
        truck.outPut();
        truck.newWheels(8);
    }
}
