package Lab6.task1;

public abstract class Man implements IGetInfoInterface {
    protected String name;
    protected String surName;

    public Man(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    public abstract String getInfo();
}
