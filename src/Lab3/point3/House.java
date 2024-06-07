package Lab3.point3;

public class House {

    private Integer floors;
    private Integer yearOfConstruction;
    private String name;

    public void setData(int floors, int yearOfConstruction, String name) {
        this.floors = floors;
        this.yearOfConstruction = yearOfConstruction;
        this.name = name;
    }

    public Integer getFloors() {
        return floors;
    }

    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return floors + ", " + yearOfConstruction + ", " + name;
    }
}
