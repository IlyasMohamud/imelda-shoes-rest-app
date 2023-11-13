package main;

public class Shoe {
    private String model;
    private String description;
    private double price;

    // Constructor receiving details from the external supplier
    public Shoe(String model, String description, double price) {
        this.model = model;
        this.description = description;
        this.price = price;
    }

     public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}