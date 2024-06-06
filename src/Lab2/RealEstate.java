package Lab2;

public class RealEstate {
    private Category category;
    private String address;
    private int yearOfConstruction;
    private double squareMeters;
    private long price;

    public RealEstate() {
        this.category = null;
        this.address = null;
        this.yearOfConstruction = 0;
        this.squareMeters = 0;
        this.price = 0;
    }

    public RealEstate(Category category) {
        this.category = category;
    }

    public RealEstate(Category category, String address) {
        this.category = category;
        this.address = address;
    }

    public RealEstate(Category category, String address, int yearOfConstruction) {
        this.category = category;
        this.address = address;
        this.yearOfConstruction = yearOfConstruction;
    }

    public RealEstate(Category category, String address, int yearOfConstruction, double squareMeters) {
        this.category = category;
        this.address = address;
        this.yearOfConstruction = yearOfConstruction;
        this.squareMeters = squareMeters;
    }

    public RealEstate(Category category, String address, int yearOfConstruction, double squareMeters, long price) {
        this.category = category;
        this.address = address;
        this.yearOfConstruction = yearOfConstruction;
        this.squareMeters = squareMeters;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return yearOfConstruction;
    }

    public long getPrice() {
        return price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYear(int year) {
        this.yearOfConstruction = year;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public String toString() {
        return this.category + ", " + this.address + ", " + this.yearOfConstruction + ", " + this.price + ", " + this.squareMeters;
    }
}
