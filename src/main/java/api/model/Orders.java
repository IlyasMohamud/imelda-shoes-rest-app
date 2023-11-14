package api.model;




public class Orders<T extends ProductInterface> {
    /**
 * Klassen `Orders` representerer en bestilling for et produkt.
 * Den er parametrisert med en generisk type `T` som utvider `ProductInterface`.
 * Felt inkluderer ordre-ID, et produkt av type `T` og kvantitet.
 * Konstruktør tar ordre-ID, produkt og kvantitet som parametere.
 * Getter- og setter-metoder er levert for hvert felt.
 * ToString-metode returnerer en strengrepresentasjon av objektet for feilsøking.
 */
    

    private int orderId;
    private T product;
    private int quantity;

    public Orders(int orderId, T product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Orders [orderId=" + orderId + ", product=" + product + ", quantity=" + quantity + "]";
    }
}
