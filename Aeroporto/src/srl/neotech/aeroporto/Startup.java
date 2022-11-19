/**
 * 
 */
package srl.neotech.aeroporto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Raphael
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroporto aeroporto=new Aeroporto();
		
		List<Aereo> listaAerei = new ArrayList<>();

		for (int i=0; i<100; i++) {
			Aereo aereo=new Aereo();
			aereo.setStato(StatoAereo.IN_PARTENZA);
			listaAerei.add(aereo);
		}
		
		for (int i=0; i<200; i++) {
			Aereo aereo=new Aereo();
			aereo.setStato(StatoAereo.IN_AVVICINAMENTO);
			listaAerei.add(aereo);
		}
		
		List<Passeggero> listaPasseggeri = new ArrayList<>();

		for (int i=0; i<1000; i++) {
			Passeggero passeggero=new Passeggero();
			listaPasseggeri.add(passeggero);
		}
	}
}
