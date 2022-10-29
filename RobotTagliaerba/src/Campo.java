import java.util.ArrayList;

public class Campo {
	
	private ArrayList<Striscia> striscie = new ArrayList<Striscia>();
	
	public Campo() {  
		for(int i=1;i<11;i++) {
			Striscia strisciaCorrente=new Striscia();
			strisciaCorrente.numeroStriscia=i;
			if(i%2==0) {
				strisciaCorrente.altezzaDiTaglio=5;
			} else {
				strisciaCorrente.altezzaDiTaglio=10;
			}
			this.striscie.add(strisciaCorrente);
		}
	}
	
	public ArrayList<Striscia> getStriscie() {
		return this.striscie;
	}
	
	//Helpers per vedere se non sto toppando nulla
	public void stampaCampo() {
		this.striscie.forEach((n) -> stampaStriscia(n));
	}
	
	private void stampaStriscia(Striscia n) {
		System.out.println("Questa è la strincia numero "+n.numeroStriscia+" e la sua altezza di taglie è "+n.altezzaDiTaglio);
	}
}
