package exercicios.classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		// tipos primitivos passam por valor
		// ojbetos passam por referencia

		// atribuicao por valor
		double a = 2;
		double b = a;

		a++;
		b--;

		System.out.println("valor a " + a + " valor b " + b);

		Data d1 = new Data(1, 6, 2022);

		// atribuicao por referncia
		
		Data d2 = d1;

		d1.setDia(31);
		d2.setMes(12);

		System.out.println(d1.getMes());
		System.out.println(d2.getDia());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.getDia());
		
		int c = 5;
		alterarPrimitivo(c);
		
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(Data d) {
		// quando recebemos um objeto no método, recebemos por referencia então ele altera o objeto passado
		d.setDia(1);
		d.setMes(1);
		d.setAno(1970);
	}

	static void alterarPrimitivo (int a) {
		//com valores primitivos é passado uma copia, ou seja passamos por valor
		a++;
	}
	
}
