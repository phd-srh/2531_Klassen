public class Main {
    public static void ausgabeKarte(Karte karte) {
        System.out.println("Spiele " + karte.getFarbe() + "-" + karte.getWert());
    }

    public static void main(String[] args) {
        Karte gelb8 = new Karte(8, "gelb");
        Karte blau9 = new Karte(9, "blau");
        Karte grün7 = new Karte(7, "grün");
        int x = grün7.getAnzahlKarten(); // <- lügt nicht mehr, oder?

        ausgabeKarte(gelb8);
        ausgabeKarte(blau9);
        ausgabeKarte(grün7);
        System.out.println("Es sind " + x + " Karten im Spiel");
    }
}
