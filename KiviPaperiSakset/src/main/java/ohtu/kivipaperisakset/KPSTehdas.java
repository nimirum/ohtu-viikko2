
package ohtu.kivipaperisakset;

public class KPSTehdas {

    public static KPS pelaajaVsPelaaja() {
        return new KPS(new Tuomari(), new Ihminen(1), new Ihminen(2));
    }

    public static KPS pelaajaVsTekoaly() {
        return new KPS(new Tuomari(), new Ihminen(1), new Tekoaly());
    }

    public static KPS pelaajaVsParannettuTekoaly() {
        return new KPS(new Tuomari(), new Ihminen(1), new TekoalyParannettu(20));
    }

}
