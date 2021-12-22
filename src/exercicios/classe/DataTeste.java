package exercicios.classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data1 = new Data();
		data1.setDia( 1);
		data1.setMes(2);
		data1.setAno(2021);

		System.out.println("dia " + data1.getDia() + " m�s " + data1.getMes()+ " ano " + data1.getAno());
		
		Data data2 = new Data();
		
		// como � estatico o MSG vai alterar para todas as instancias daqla classe
		
		data2.setMsg("teste");
		
		// para acessar atributo static podemos acessar diretamente pela classe, j� que ele n�o � um atributo de instancia � DE CLASSE
		
		System.out.println(Data.msg);
		
		System.out.println(data2.getAno());
		System.out.println(data2.getMsg());
		System.out.println(data1.getMsg());
	}

}
