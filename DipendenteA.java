package dipendente;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonino
 */
public class DipendenteA extends Dipendente {

    /**
     * @param args the command line arguments
     */
    Integer malattia;
    
    public DipendenteA(String matri, Double sti, Double ex){
    	super(matri, sti, ex);
        malattia=0;
    }
    
    public void prendiMalattia(int gg){
        malattia = malattia + gg;
    }
    
    @Override
    public Double paga(int ore) {
    	// TODO Auto-generated method stub
    	Double tmp = super.paga(ore);
    	if (malattia==0){
    		return tmp;
    	} else {
    		tmp -= (malattia * 15);
    	}
    	return tmp;
    }
    
    public void stampaMalattia(){
    	System.out.println(malattia);
    }
}
