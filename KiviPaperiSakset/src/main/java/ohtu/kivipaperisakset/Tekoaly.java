package ohtu.kivipaperisakset;

public class Tekoaly implements Pelaaja {

    int siirto;

    public Tekoaly() {
        siirto = 0;
    }

    @Override
    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;
        String siirtoString;

        switch (siirto) {
            case 0:
                siirtoString = "k";
            case 1:
                siirtoString = "p";
            default:
                siirtoString = "s";
        }
        
        System.out.println("Tietokone valitsi: " + siirtoString);
        return siirtoString;
    }

    @Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
