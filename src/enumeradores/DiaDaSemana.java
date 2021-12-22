package enumeradores;

/* referencias https://www.youtube.com/watch?v=eTtArKB24pc
Pode ser comparado usando ==
N�o pode ser instanciado com new
Podem implementar interface
Pode ser separado ou dentro de classe
N�o existe heran�a de enum
 */
public enum DiaDaSemana {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valorDia;

    DiaDaSemana(int valorDia) {
        this.valorDia = valorDia;
    }

    public int getValorDia() {
        return valorDia;
    }

    public static String getDescricao(int valorDia) {
        if (valorDia > DiaDaSemana.values().length){
            return "N�O ENCONTRADO";
        }
        return DiaDaSemana.values()[valorDia - 1].name();
    }


}
