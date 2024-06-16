package Lab6.task1;

public class Test {
    public static void main(String[] args) {
        BankEmployee employee = new BankEmployee("Ivan", "Ivanov", "Sber");
        Client client = new Client("John", "Johnson", "Tbank");
        System.out.println(employee.getInfo());
        System.out.println(client.getInfo());
    }
}
