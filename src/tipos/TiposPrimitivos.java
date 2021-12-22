package tipos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		
		// byte vai de +127 a -127
		byte byte1 = 127;
		byte byte2 = -127;
		
		//short vai de -32767 a 32767
		short short1 = 32767;
		int int1 = 2_147_483_647;
		//por padrão qualquer literal que informaos seria um inteiro, então temos que indicar com L por exemplo
		//que trata-se de um long
		long long1 = 9_223_372_036_854_775_807L;
		
		System.out.printf("%b %b\n", bol1, bol2);
		System.out.printf("%c %c %c\n", c1, c2, c3);
		System.out.printf("byte %d short %d int %d long %d\n", byte1, short1, int1, long1);
		
		System.out.println(Integer.toBinaryString(byte2));
		System.out.println(Integer.toBinaryString(short1));
		System.out.println(Integer.toBinaryString(int1));
		System.out.println(Long.toBinaryString(long1));
		
		// por padrão um número com ponto é um double
		float f = 3.1416f;
		double d = 2.45;
		
		System.out.printf("%.2f %.1f", f, d);
		
		
	}
	

}
