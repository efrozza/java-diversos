package numeros;

import java.text.NumberFormat;
import java.util.Locale;

public class NumerFormatTest {
	
	public static void main(String[] args) {

		// PAGINA COM LOCALES https://www.oracle.com/java/technologies/javase/jdk8-jre8-suported-locales.html

		float valor = 123.4567f;
		Locale locFR = new Locale("fr");
		
		NumberFormat[] nfa = new NumberFormat[5];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getCurrencyInstance(new Locale("ja-JP-u-ca-japanese", "JP"));
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFR);
		nfa[4] = NumberFormat.getCurrencyInstance(Locale.US);
		
		for (NumberFormat nf : nfa) {
			System.out.println(nf.format(valor));
		}
		
	}

}
