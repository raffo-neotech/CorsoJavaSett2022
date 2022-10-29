
public class Startup {

	public static void main(String[] args) {
		Campo campoDaTagliare=new Campo();
		//campoDaTagliare.stampaCampo();	//TEST
		Tagliaerba tagliaerba=new Tagliaerba();
		tagliaerba.setCampo(campoDaTagliare);
		
		tagliaerba.TagliaCampo();
	}

}
