package dipendente;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonino
 */
public class Main {
    public static void main(String[] args){

            Dipendente dip= new Dipendente("125", 20000.0, 15.0);
            dip.stampa();
            System.out.println("Stipendio Base + straordinario: " + dip.paga(2));
            
            DipendenteA dipa= new DipendenteA("155", 22000.0, 10.0);
            dipa.prendiMalattia(5);
            
            dipa.stampaMalattia();
            System.out.println("Stipendio Base + straordinario - malattia: " + dipa.paga(2));

            
        }
}
