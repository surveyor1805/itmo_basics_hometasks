package Lab7;

public class Test {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Airplane.Wing wing = airplane.new Wing();
        wing.setWingWeight(20.2);
        wing.getWingWeight();
        Airplane superJet = new Airplane();
        Airplane.Wing jetWing = superJet.new Wing();
        jetWing.setWingWeight(40.6);
        jetWing.getWingWeight();
    }
}
