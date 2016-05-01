package ohtu;

import javax.swing.JTextField;

class Summa implements Komento {

    private final Sovelluslogiikka sovellus;
    private final JTextField tuloskentta;
    private final JTextField syotekentta;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        sovellus.plus(Integer.parseInt(this.syotekentta.getText()));
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
