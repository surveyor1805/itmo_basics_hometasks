package Lab6.task1;

public class Client extends Man {
    protected String bankName;

    public Client(String name, String surName, String bankName) {
        super(name, surName);
        this.bankName = bankName;
    }

    @Override
    public String getInfo() {
        return super.getName() + " " + super.getSurName() + " " + this.bankName;
    }
}
