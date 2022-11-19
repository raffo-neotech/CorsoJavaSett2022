package srl.neotech.aeroporto;

public class ModelloAereo {
	//costruttore (String) -> si intende la società che costruisce l aereo o il costruttore della classe ?
	//codiceModello (String)
	//capienzaNumPasseggeri. (Integer)
	//L'orario è espresso in minuti casuali (es. 10, 50, 130, 80, 70).
	
	//costruttore -> produttore (String)
	private String produttore;
	
	//codiceModello (String)
	private String codiceModello;
	
	//capienzaNumPasseggeri. (Integer)
	private Integer capienzaNumPasseggeri;
	
	//L'orario è espresso in minuti casuali (es. 10, 50, 130, 80, 70).
	private Integer orario;
	
	//GETTERS AND SETTERS
	
	public String getCostruttore() {
		return produttore;
	}
	public void setCostruttore(String costruttore) {
		this.produttore = costruttore;
	}
	public String getCodiceModello() {
		return codiceModello;
	}
	public void setCodiceModello(String codiceModello) {
		this.codiceModello = codiceModello;
	}
	public Integer getCapienzaNumPasseggeri() {
		return capienzaNumPasseggeri;
	}
	public void setCapienzaNumPasseggeri(Integer capienzaNumPasseggeri) {
		this.capienzaNumPasseggeri = capienzaNumPasseggeri;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
}
