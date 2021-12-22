package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// Segue os wrappers
		Byte b = 1;
		Short s = 1000;

		Integer i = 50000;
		Long l = 1000000L;

		// tendo wrapper conseguimos usar métodos

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println("doubleValue de short " + s.doubleValue());
		System.out.println("floatValue de short " + s.floatValue());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123F;
		System.out.println(f);
		
		Double db = 1234.678;
		System.out.println(db);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		//nesse exemplo convertemos o boolean para string e usamos o método UpperCase da string
		System.out.println(bo.toString().toUpperCase());

		Character c = '#'; // char
		System.out.println(c.toString());
		
	}

}
