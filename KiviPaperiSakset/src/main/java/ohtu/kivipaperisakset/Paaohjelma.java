package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);
    private final HashMap<String, KPS> pelitilat;

    public Paaohjelma() {
        pelitilat = new HashMap<String, KPS>();
        pelitilat.put("a", KPSTehdas.pelaajaVsPelaaja());
        pelitilat.put("b", KPSTehdas.pelaajaVsTekoaly());
        pelitilat.put("c", KPSTehdas.pelaajaVsParannettuTekoaly());
    }

    public static void main(String[] args) {
        Paaohjelma paaohjelma = new Paaohjelma();
        paaohjelma.suorita();
    }

    public void suorita() {
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetetaan");

            KPS pelimoodi = valitsePelitilaSyotteesta();

            if (pelimoodi == null) {
                break;
            }

            pelimoodi.pelaa();

        }
    }

    private KPS valitsePelitilaSyotteesta() {
        String vastaus = scanner.nextLine();
        if (vastaus != null && !vastaus.isEmpty()) {
            String vastausVikaMerkki = vastaus.substring(vastaus.length() - 1);

            return pelitilat.get(vastausVikaMerkki);
        } else {
            return null;
        }
    }

}
