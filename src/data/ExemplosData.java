package data;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ExemplosData {
	
	public static void main(String[] args) {
		
		// video para consulta https://www.youtube.com/watch?v=vZZJqYNxiLg

		//data atual
		// a partir do JAVA 8 LocalDate é mais usado
		LocalDate dataHoje = LocalDate.now();
		System.out.println("Data atual: " + dataHoje);
		
		//hora atual
		LocalTime horaAgora = LocalTime.now();		
		System.out.println("Hora atual " + horaAgora);
		
		//hora truncada				
		LocalTime horaMinuto = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
		System.out.println(horaMinuto);
		
		//parse data
		LocalDate dataEspecificaDoTexto = LocalDate.parse("2017-12-25");
		System.out.println(dataEspecificaDoTexto);
		
		//maximo data
		System.out.println("Maior hora possivel" + LocalTime.MAX);
		
		//diferente entre datas e horas
		LocalDateTime inicio = LocalDateTime.of(2021, 1, 25, 10, 00, 00);
		LocalDateTime termino = LocalDateTime.of(2021, 1, 28, 11, 20, 15);
		
		Period periodo = Period.between(inicio.toLocalDate(), termino.toLocalDate());

		System.out.println("Diferença entre datas " + inicio + " e " + termino);
		System.out.println("Diferença em anos: " + periodo.getYears());
		System.out.println("Diferença em meses: " + periodo.getMonths());
		System.out.println("Diferença em dias: " + periodo.getDays());
		
		Duration duracao = Duration.between(inicio, termino);

		System.out.println("Dias entre duas datas usando duration: " + duracao.toDays());
		System.out.println("Total de horas entre duas datas: " + duracao.toHours());
	}

}
