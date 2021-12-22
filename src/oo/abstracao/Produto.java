package oo.abstracao;

import java.util.List;

public abstract class Produto {
    private long codigo;
    private String nome;
    public abstract List<Operacao> validaOperacoes(int segmentoCLI, int segmentoContas);

}
