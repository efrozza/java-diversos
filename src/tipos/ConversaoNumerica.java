package tipos;

public class ConversaoNumerica {

	public static void main(String[] args) {

		// todo valor decimal é double, então exige conversao explicita
		float f = (float) 0.1;
		System.out.println(f);
		
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// conversao implicita
		
		int i2 = 'a';
		System.out.println(i2);
		
		double d = 1001;
		System.out.println(d);

	}

}
