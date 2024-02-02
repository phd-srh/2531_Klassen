public class Karte {
    private int wert;
    private String farbe;
    private int anzahlKarten = 0;

    // Standard (normale) Konstruktor
    public Karte(int wert, String farbe) {
        this.wert = wert;
        this.farbe = farbe;
        anzahlKarten++;
    }

    public int getWert() {
        return wert;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getAnzahlKarten() {
        return anzahlKarten;
    }
}
