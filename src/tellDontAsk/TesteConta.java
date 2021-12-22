package tellDontAsk;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta contaTeste = new Conta();
		contaTeste.deposita(1000);
		
		if	(contaTeste.getSaldo() > 0 ) {
			contaTeste.saca(100);
		}
		
		
		
	}

}
