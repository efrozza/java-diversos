package textos;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TestesGerais {
	
	public static void main(String[] args) {
		
		String valor = "250";
		String sinal = "+";	
		
	    NumberFormat numeroFormatadoMoeda = NumberFormat.getInstance();

	    String c = numeroFormatadoMoeda.format(new BigDecimal(valor.toString()));
	    System.out.println("Currency Format: "+ sinal + c);
	    
	    DecimalFormat df = new DecimalFormat();
	    df.setMaximumFractionDigits(2);
	    System.out.println(df.format(000001));
	    
	    String testeZero = "00000000";
	    
	    if (testeZero.contentEquals("00000000")){
	    	System.out.println(("zeros"));
	    }
	}

}
