package main;

public class Shoe {
    private final String model;
    private final String description;
    private final double price;

    public Shoe(String model, String description, double price) {
        this.model = model;
        this.description = description;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // class immutable
}
