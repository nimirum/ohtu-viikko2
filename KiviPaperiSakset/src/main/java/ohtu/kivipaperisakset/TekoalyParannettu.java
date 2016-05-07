package ohtu.kivipaperisakset;

// "Muistava tekoäly"
public class TekoalyParannettu implements Pelaaja {

    private final String[] muisti;
    private int vapaaMuistiIndeksi;
    private int k = 0;
    private int p = 0;
    private int s = 0;

    public TekoalyParannettu(int muistinKoko) {
        muisti = new String[muistinKoko];
        vapaaMuistiIndeksi = 0;
    }

    @Override
    public void asetaSiirto(String siirto) {
        // jos muisti täyttyy, unohdetaan viimeinen alkio
        if (vapaaMuistiIndeksi == muisti.length) {
            for (int i = 1; i < muisti.length; i++) {
                muisti[i - 1] = muisti[i];
            }

            vapaaMuistiIndeksi--;
        }

        muisti[vapaaMuistiIndeksi] = siirto;
        vapaaMuistiIndeksi++;
    }

    @Override
    public String annaSiirto() {
        String siirtoString;
        if (vapaaMuistiIndeksi == 0 || vapaaMuistiIndeksi == 1) {
            System.out.println("Tietokone valitsi: k");
            return "k";
        }

        String viimeisinSiirto = muisti[vapaaMuistiIndeksi - 1];

        for (int i = 0; i < vapaaMuistiIndeksi - 1; i++) {
            if (viimeisinSiirto.equals(muisti[i])) {
                String seuraava = muisti[i + 1];

                if ("k".equals(seuraava)) {
                    k++;
                } else if ("p".equals(seuraava)) {
                    p++;
                } else {
                    s++;
                }
            }
        }

        // Tehdään siirron valinta esimerkiksi seuraavasti;
        // - jos kiviä eniten, annetaan aina paperi
        // - jos papereita eniten, annetaan aina sakset
        // muulloin annetaan aina kivi
        if (k > p && k > s) {
            siirtoString = "p";
        } else if (p > k && p > s) {
            siirtoString = "s";
        } else {
            siirtoString = "k";
        }
        System.out.println("Tietokone valitsi: " + siirtoString);
        return siirtoString;
        // Tehokkaampiakin tapoja löytyy, mutta niistä lisää 
        // Johdatus Tekoälyyn kurssilla!
    }
}
