package scacchi;

import java.util.ArrayList;

public class tavoloDaGioco {
	/*
	public String nome;
	public int anni;
	public int livelloAbilita;
	*/
	public ArrayList<cella> celle = new ArrayList<cella>();
	
	public static void main(String[] args) {
		char[] lettere = {'a','b','c','d','e','f','g'};
		
		int numeroCella=1;
		
		for(int i=0; i<=7 ; i++) {
			for(int j=1; j<=8 ; j++) {
				cella cellaCorrente=new cella();
				cellaCorrente.X=lettere[i];
				cellaCorrente.Y=lettere[j];
				cellaCorrente.numeroCella=numeroCella;
				
				if(numeroCella%2==0) {
					cellaCorrente.bianca=true;
					cellaCorrente.nera=false;
				} else {
					cellaCorrente.bianca=false;
					cellaCorrente.nera=true;
				}
				
				numeroCella++;
				
			}
		}
	}
}
