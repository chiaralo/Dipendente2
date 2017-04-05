package dipendente;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonino
 */
//prova modifica
public class Dipendente {

    /**
     * @param args the command line arguments
     */
    String matricola;
    Double stipendiobase;
    Double extra;
    
    public Dipendente(){
        
    }
    public Dipendente(String matri, Double sti, Double ex){
        matricola=matri;
        stipendiobase=sti;
        extra=ex;
    }
    
    public Double getStipendio(){
        return stipendiobase;
    }
    
    public Double paga(int ore){
        return stipendiobase + (extra * ore);
    }
    
    public void stampa(){
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio Base: " + stipendiobase);

    }
}
