package api.model;

public interface ProductInterface {
    /**
 * Grensesnittet `ProductInterface` definerer egenskapene som forventes av alle produktklasser.
 * Inkluderer metoder for å hente ID, merke, modell, størrelse, farge, pris,
 * status for utgående, og status for utsolgt. Setter-metoder er også inkludert.
 */






    Integer getId();

    String getBrand();

    String getModel();

    double getSize();

    String getColor();

    double getPrice();

    boolean isOnWayOut();

    void setOnWayOut(boolean onWayOut);

    boolean isSoldOut();

    void setSoldOut(boolean soldOut);
}
