package api.model;


public class Shoe implements ProductInterface {
    /**
 * Klassen `Shoe` representerer en sko som implementerer `ProductInterface`.
 * Inkluderer egenskaper som ID, merke, modell, størrelse, farge, pris,
 * samt status for utgående og status for utsolgt.
 * Konstruktøren initialiserer feltene ved opprettelse av et sko-objekt.
 * ToString-metoden gir en strengrepresentasjon av sko-objektet.
 */
    private final Integer id;
    private final String brand;
    private final String model;
    private final double size;
    private final String color;
    private final double price;
    private boolean onWayOut;
    private boolean soldOut;

    public Shoe(Integer id, String brand, String model, double size, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
        this.onWayOut = false; // Initialize to false
        this.soldOut = false; // Initialize to false
    }

    public String toString() {
        return "Shoe [id=" + id + ", brand=" + brand + ", model=" + model + ", size=" + size + ", color=" + color + ", price=" + price + ", onWayOut=" + onWayOut + ", soldOut=" + soldOut + "]";
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

    public boolean isOnWayOut() {
        return onWayOut;
    }

    public void setOnWayOut(boolean onWayOut) {
        this.onWayOut = onWayOut;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
