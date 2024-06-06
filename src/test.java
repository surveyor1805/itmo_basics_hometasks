import Lab2.Calculator;
import Lab2.Category;
import Lab2.RealEstate;

public class test {
    public static void main(String[] args) {
        //calculator test
        /*
        int a = 40;
        double b = 3.3;
        System.out.println(Calculator.sum(a, b));
        System.out.println(Calculator.divide(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.subtract(a, b));
         */
        //realEstate test
        RealEstate flat = new RealEstate();
        System.out.println(flat);
        RealEstate house = new RealEstate(Category.COMMERCIAL, "Saint-Petersburg, Nevskiy pr., 5", 1800, 50.5, 1000000000L);
        System.out.println(house);
        house.setAddress("Moscow, 10");
        house.setCategory(Category.INDUSTRIAL);
        System.out.println(house);
        System.out.println(house.getPrice());
    }
}
