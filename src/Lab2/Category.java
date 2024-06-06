package Lab2;

public enum Category {

    HOUSE("Дом"),
    APARTMENT("Квартира"),
    COTTAGE("Коттедж"),
    COMMERCIAL("Коммерческая"),
    INDUSTRIAL("Промышленная");
    private final String description;
    Category(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}

