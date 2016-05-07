package ohtu.kivipaperisakset;

public class KPS {

    private final Tuomari tuomari;
    private final Pelaaja pelaaja1;
    private final Pelaaja pelaaja2;
    private String pelaajan1Siirto;
    private String pelaajan2Siirto;

    public KPS(Tuomari tuomari, Pelaaja pelaaja1, Pelaaja pelaaja2) {
        this.tuomari = tuomari;
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
    }

    public void pelaa() {
        aloitaPeli();
        siirto();
        lopetus();
    }

    private void aloitaPeli() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        tuomari.aloitaUusiPeli();
        pelaajan1Siirto = pelaaja1.annaSiirto();
        pelaajan2Siirto = pelaaja2.annaSiirto();
    }

    private void siirto() {
        while (onkoOkSiirto(pelaajan1Siirto) && onkoOkSiirto(pelaajan2Siirto)) {
            tuomari.kirjaaSiirto(pelaajan1Siirto, pelaajan2Siirto);

            pelaajan1Siirto = pelaaja1.annaSiirto();
            pelaajan2Siirto = pelaaja2.annaSiirto();

            pelaaja2.asetaSiirto(pelaajan1Siirto);
        }
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    private void lopetus() {
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

}
