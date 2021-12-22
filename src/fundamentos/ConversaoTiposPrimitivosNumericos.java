package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		// covnersão explicita CAST com perda de dados
		float b = (float) 1.12345678;
		System.out.println(b);
		
		// byte nao suporta o tamanho do int. O java só analista tipos não valor	
		int c = 128;
		byte d = (byte) c;
		System.out.println(d);
		
		// colocando double em int, perda de dados
		double e = 1.67;
		int f = (int) e;
		System.out.println(f);
		
		
	}

}
