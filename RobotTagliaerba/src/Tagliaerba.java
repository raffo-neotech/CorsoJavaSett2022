
public class Tagliaerba {
	private Campo  campoDaTagliare;
	private Striscia strisciaInElaborazione;
	private Integer indexStriscie=0;
	private Integer passo;
	private String stato;
	private Integer altezzaLama;
	
	public void setCampo(Campo campoParam) {
		this.campoDaTagliare=campoParam;
		this.strisciaInElaborazione=this.campoDaTagliare.getStriscie().get(0);
	}
	
	private void prossimaStriscia() {
		if(this.indexStriscie%2==0) {
			this.gira(2, "DX");
		} else {
			this.gira(2, "SX");
		}
		
		this.indexStriscie++;
		this.strisciaInElaborazione=this.campoDaTagliare.getStriscie().get(this.indexStriscie);
	}
	
	public void TagliaCampo() {
		while(this.indexStriscie<(this.campoDaTagliare.getStriscie().size()-1)) {
			this.tagliaStriscia();
			this.prossimaStriscia();
		}
	}
	
	private void tagliaStriscia() {
		for(this.passo=1;this.passo<=80;) {
			this.stato="In Taglio";
			this.avanzaDiUnPasso();
		}
	}
	
	private void avanzaDiUnPasso() {
		System.out.println("–TAGLIAERBA: stato: "+this.stato+", --STRISCIA: "+this.strisciaInElaborazione.numeroStriscia+
				   ", passo "+this.passo+", altezza: "+this.strisciaInElaborazione.altezzaDiTaglio+"cm");
		this.passo++;
	}
	
	private void gira(Integer numeroRotazioni, String direzione) {
		System.out.println("–TAGLIAERBA: stato: In Rotazione DX, passo 1: 90 gradi");
	}
}
