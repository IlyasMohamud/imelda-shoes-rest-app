package api.model;

import java.util.List;


public class User {
    /**
 * Klassen `User` representerer en bruker i systemet.
 * Inkluderer egenskaper som ID, navn, alder, e-post, og en liste av ordrer.
 * Konstruktøren initialiserer feltene ved opprettelse av et bruker-objekt.
 * Metodene for å hente og sette verdier er også inkludert.
 * Checkout-metoden utfører en sjekk og gir en virtuell gavekort hvis betingelsen er oppfylt.
 */

    private int id;
    private String name;
    private int age;
    private String email;
    private List<Orders<? extends ProductInterface>> orders;

    public User(int id, String name, int age, String email, List<Orders<? extends ProductInterface>> orders) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public List<Orders<? extends ProductInterface>> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders<? extends ProductInterface>> orders) {
        this.orders = orders;
    }

    public void checkout() {
        int orderCount = orders.size();
        if (orderCount % 3 == 0) {
            // Generate a virtual gift card
            // Add logic to associate the gift card with the user
            // and set an expiration date
            System.out.println("Congratulations! You've earned a gift card of NOK 750. With code :add code from giftcard list");
        }
    }

}
