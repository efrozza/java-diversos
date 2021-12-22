package exercicios.classe;

public class Data {
	
	// atributos de classe
	
	private int dia;
	private int mes;
	private int ano;
	
	static String msg = "Mensagem de data";
	
	public Data () {
		
		// quando criarmos uma data via construtor padrão ele vai assumir os valores abaixo
		
		this.dia = 01;
		this.mes = 01;
		this.ano = 1970;
		
	}
	
	public Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public static String getMsg() {
		return msg;
	}

	public static void setMsg(String msg) {
		Data.msg = msg;
	}

	
	
}
