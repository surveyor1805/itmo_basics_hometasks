package Lab3.point3;

public class HouseTest {
    public static void main(String[] args) {
        House myHouse = new House();
        House notMyHouse = new House();
        myHouse.setData(25, 2008, "Apartment");
        notMyHouse.setData(3, 2024, "Cottage");
        System.out.println(myHouse.getData());
        System.out.println(notMyHouse.getData());
    }
}
