package api.model;

public class Orders<T extends ProductInterface> {

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
