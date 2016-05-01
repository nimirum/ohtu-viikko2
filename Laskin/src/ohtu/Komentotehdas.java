package ohtu;

import java.util.HashMap;
import javax.swing.JTextField;

public class Komentotehdas {

    private final HashMap<Object, Komento> komennot;

    public Komentotehdas(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        komennot = new HashMap<>();
        komennot.put("summa", new Summa(sovellus, tuloskentta, syotekentta));
        komennot.put("erotus", new Erotus(sovellus, tuloskentta, syotekentta));
        komennot.put("nollaa", new Nollaa(sovellus, tuloskentta, syotekentta));
    }

    public Komento hae(String toiminto) {
        Komento komento = komennot.get(toiminto);
        return komento;
    }
    
}
