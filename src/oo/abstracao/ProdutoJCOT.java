package oo.abstracao;

import java.util.ArrayList;
import java.util.List;

public class ProdutoJCOT extends Produto{
    @Override
    public List<Operacao> validaOperacoes(int segmentoCLI, int segmentoContas) {

        List<Operacao> listaOperacoes = new ArrayList<>();

        if (segmentoCLI == 10) {
            Operacao resgate = Operacao.builder()
                    .nome("resgate")
                    .permite(true)
                    .build();
            listaOperacoes.add(resgate);
            return listaOperacoes;
        }

        return listaOperacoes;
    }
}
