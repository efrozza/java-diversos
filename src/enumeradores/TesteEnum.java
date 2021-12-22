package enumeradores;

public class TesteEnum {

    public static void main(String[] args) {
        DiaDaSemana dia = DiaDaSemana.DOMINGO;
        System.out.println(dia.toString() + " - " + dia.getValorDia());

        System.out.println(DiaDaSemana.getDescricao(8));
        System.out.println(Enum.valueOf(DiaDaSemana.class, "ab").getValorDia());
    }



}
