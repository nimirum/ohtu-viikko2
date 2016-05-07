package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Ihminen implements Pelaaja {

    private static final Scanner scanner = new Scanner(System.in);
    private final int pelaajaNumero;

    public Ihminen(int pelaajaNumero) {
        this.pelaajaNumero = pelaajaNumero;
    }

    @Override
    public String annaSiirto() {
        if (pelaajaNumero == 1) {
            System.out.print("Ensimmäisen pelaajan siirto: ");
        } else {
            System.out.print("Toisen pelaajan siirto: ");
        }

        return scanner.nextLine();
    }

    @Override
    public void asetaSiirto(String siirto) {   
         // ei tehdä mitään 
    }

}
