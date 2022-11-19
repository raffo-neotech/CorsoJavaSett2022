package srl.neotech.aeroporto;

import java.util.List;

public class Aereo {
	//idUnivoco (Integer)
	//orario (Integer)
	//compagniaAerea, (String)
	//modello (ModelloAereo)
	//passeggeri (List Passeggeri)
	//velocità (Integer) da 0 a 10.  
	//distanzaDallAeroporto  Integer (da 1 a 500), 
	//stato (Enumeration: IN_PARTENZA,DECOLLATO,FUORI_SPAZIO_AEREO,IN_AVVICINAMENTO,ATTERRATO).

	//idUnivoco (Integer)
	private Integer idUnivoco;
	
	//orario (Integer)
	private Integer orario;

	//compagniaAerea, (String)
	private String compagniaAerea;

	//modello (ModelloAereo)
	private ModelloAereo modelloAereo;

	//passeggeri (List Passeggeri)
	private List<Passeggero> passeggeri;

	//velocità (Integer) da 0 a 10.  
	private Integer velocita;

	//distanzaDallAeroporto  Integer (da 1 a 500), 
	private Integer distanzaDallAereoporto;

	//stato (Enumeration: IN_PARTENZA,DECOLLATO,FUORI_SPAZIO_AEREO,IN_AVVICINAMENTO,ATTERRATO).
	private StatoAereo stato;
	
	//GETTERS AND SETTERS

	public Integer getIdUnivoco() {
		return idUnivoco;
	}

	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}

	public Integer getOrario() {
		return orario;
	}

	public void setOrario(Integer orario) {
		this.orario = orario;
	}

	public String getCompagniaAerea() {
		return compagniaAerea;
	}

	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}

	public ModelloAereo getModelloAereo() {
		return modelloAereo;
	}

	public void setModelloAereo(ModelloAereo modelloAereo) {
		this.modelloAereo = modelloAereo;
	}

	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}

	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

	public Integer getDistanzaDallAereoporto() {
		return distanzaDallAereoporto;
	}

	public void setDistanzaDallAereoporto(Integer distanzaDallAereoporto) {
		this.distanzaDallAereoporto = distanzaDallAereoporto;
	}

	public StatoAereo getStato() {
		return stato;
	}

	public void setStato(StatoAereo stato) {
		this.stato = stato;
	}
}
