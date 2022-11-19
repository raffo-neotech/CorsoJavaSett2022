package srl.neotech.aeroporto;

import java.util.List;

public class Aeroporto {
	
	//Aerei (Lista di Aereo)
	//Passeggeri (Lista di Passeggero)
	//raggioDiAzione (Integer) che indica il raggio in km(da 1 a 100) entro il quale gestisce gli Aerei, intorno al proprio spazio aereo.
	
	//ERRORE NELLE SPECIFICHE ?
	//public Aereo attterraggio(Aereo)         (accetta un Aereo in volo e resituisce un Aereo atterrato)
	//public Aereo checkout(Aereo)   (accetta un passeggero imbarcato e lo restituisce in checkout)
	//public Aereo checkin(Aereo, Passeggeri)    (accetta un passeggero in checkin e ritorna un passeggero imbarcato) 
	//public Aereo decollo(Aereo)              (accetta un aereo a terra e lo resituisce in volo)
	
	
	
	//Aerei (Lista di Aereo)
	private List<Aereo> aerei;
	
	//Passeggeri (Lista di Passeggero)
	private List<Passeggero> passeggeri;
	
	//raggioDiAzione (Integer) che indica il raggio in km(da 1 a 100) entro il quale gestisce gli Aerei, intorno al proprio spazio aereo.
	private Integer raggioDiAzione;
	
	//METODI
	
	//public Aereo attterraggio(Aereo)         (accetta un Aereo in volo e resituisce un Aereo atterrato)
	public Aereo atterraggio(Aereo aereoInVolo) {
		if((aereoInVolo.getStato()==StatoAereo.DECOLLATO)) {
			aereoInVolo.setStato(StatoAereo.ATTERRATO);
		} else if((aereoInVolo.getStato()==StatoAereo.FUORI_SPAZIO_AEREO)) {
			aereoInVolo.setStato(StatoAereo.ATTERRATO);
		} else if((aereoInVolo.getStato()==StatoAereo.IN_AVVICINAMENTO)) {
			aereoInVolo.setStato(StatoAereo.ATTERRATO);
		} else {
			//ERRORE L AEREO NON è IN VOLO
		} 
		return aereoInVolo;
	}
	
	//public Aereo checkout(Aereo)   (accetta un passeggero imbarcato e lo restituisce in checkout)
	public Passeggero checkout(Passeggero passeggeroImbarcato) {
		if((passeggeroImbarcato.getStato()==StatoPasseggero.CHECKIN)) {
			passeggeroImbarcato.setStato(StatoPasseggero.CHECKOUT);
		} else {
			//ERRORE IL PASSEGGERO NON è IN CHEKIN
		} 
		return passeggeroImbarcato;
	}
	
	//public Aereo checkin(Aereo, Passeggeri)    (accetta un passeggero in checkin e ritorna un passeggero imbarcato) 
	public Passeggero checkin(Passeggero passeggeroChekingIn) {
		if((passeggeroChekingIn.getStato()==StatoPasseggero.CHECKIN)) {
			passeggeroChekingIn.setStato(StatoPasseggero.IMBARCATO);
		} else {
			//ERRORE IL PASSEGGERO NON è IN CHEKIN
		} 
		return passeggeroChekingIn;
	}
	
	//public Aereo decollo(Aereo)              (accetta un aereo a terra e lo resituisce in volo)
	public Aereo decollo(Aereo aereoATerra) {
		if((aereoATerra.getStato()==StatoAereo.ATTERRATO)) {
			aereoATerra.setStato(StatoAereo.DECOLLATO);
		} else {
			//ERRORE L AEREO NON è A TERRA
		} 
		return aereoATerra;
	}
	
	//GETTERS AND SETTERS


	public List<Aereo> getAerei() {
		return aerei;
	}

	public void setAerei(List<Aereo> aerei) {
		this.aerei = aerei;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}
	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}
}
