//HomeTask 3 point 2
package Lab3.point2;

public class Car {
    private Color color;
    private String name;
    private Double weight;

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public Car() {}

    public String getAll() {
        return this.color + ", " + this.weight;
    }

}
