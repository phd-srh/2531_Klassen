public class Karte {
    private int wert;                    // Instanzvariablen
    private String farbe;
    private static int anzahlKarten = 0; // Klassenvariable

    public static final int MAX_ANZAHL_KARTEN = 10;

    // Standard (normale) Konstruktor
    public Karte(int wert, String farbe) {
        this.wert = wert;
        this.farbe = farbe;
        anzahlKarten++;
    }

    public int getWert() {
        return wert;
    }

    // Instanzmethode
    public String getFarbe() {
        return farbe;
    }

    // Klassenmethode
    public static int getAnzahlKarten() {
        return anzahlKarten;
    }
}
