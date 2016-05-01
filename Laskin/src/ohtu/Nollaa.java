package ohtu;

import javax.swing.JTextField;

class Nollaa implements Komento {

    private final Sovelluslogiikka sovellus;
    private final JTextField syotekentta;
    private final JTextField tuloskentta;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        tuloskentta.setText(String.valueOf(sovellus.tulos()));
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        sovellus.peru();
        this.tuloskentta.setText(sovellus.tulos() + "");
        this.syotekentta.setText("");
    }

}
