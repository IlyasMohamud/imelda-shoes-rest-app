package main;

public class Shoe {
    private final Integer id;
    private final String brand;
    private final String model;
    private final double size;
    private final String color;
    private final double price;

    public Shoe(Integer id, String brand, String model, double size, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Shoe [id=" + id + ", brand=" + brand + ", model=" + model + ", size=" + size + ", color=" + color + ", price=" + price + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}


