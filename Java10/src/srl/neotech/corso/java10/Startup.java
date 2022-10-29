package srl.neotech.corso.java10;

import java.util.ArrayList;
import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random=new Random();
		int n=0;
		for(int i=0;i<10;i++) {
			n=random.nextInt(10)+1;
			System.out.println(n);
		}
		
		System.out.println("------------");
		
		do {
			n=random.nextInt(10)+1;
			System.out.println(n);
		} while(n%3!=0);
		
		System.out.println("------------");
		
		ArrayList<Integer> arrayNumeri = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			n=random.nextInt(10)+1;
			arrayNumeri.add(n);
		}
		
		for(int numeroCorrente:arrayNumeri) {
			System.out.println(numeroCorrente);
		}
		
	}

}
