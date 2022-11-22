package srl.neotech.aeroporto;

public class Passeggero {
	//idUnivoco, (Integer)
	//MF  (Char)
	//hasFiore (Boolean)
	//eta.  (integer)
	//haBagagli. (Boolean)
	

	//idUnivoco, (Integer)
	private Integer idUnivoco;
	//MF  (Char)
	private char MF;
	//hasFiore (Boolean)
	private Boolean hasFiore;
	//eta.  (integer)
	private Integer eta;
	//haBagagli. (Boolean)
	private Boolean haBagagli;

	private StatoPasseggero stato;
	
	//METODI
	
	public void randomize() {
		
	}
	
	//GETTERS AND SETTERS

	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public char getMF() {
		return MF;
	}
	public void setMF(char mF) {
		MF = mF;
	}
	public Boolean getHasFiore() {
		return hasFiore;
	}
	public void setHasFiore(Boolean hasFiore) {
		this.hasFiore = hasFiore;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	public Boolean getHaBagagli() {
		return haBagagli;
	}
	public void setHaBagagli(Boolean haBagagli) {
		this.haBagagli = haBagagli;
	}
	public StatoPasseggero getStato() {
		return stato;
	}
	public void setStato(StatoPasseggero stato) {
		this.stato = stato;
	}
}
