package Lab6.task3;

public class Truck extends Car {
    protected int wheelsAmount;
    protected double maxWeight;

    public Truck(int w, String m, char c, float s, int wheelsAmount, double maxWeight) {
        super(w, m, c, s);
        this.wheelsAmount = wheelsAmount;
        this.maxWeight = maxWeight;
    }
    public void newWheels(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
        System.out.println(wheelsAmount);
    }
}
