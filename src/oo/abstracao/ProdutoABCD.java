package oo.abstracao;

import java.util.ArrayList;
import java.util.List;

public class ProdutoABCD extends Produto{
    @Override
    public List<Operacao> validaOperacoes(int segmentoCLI, int segmentoContas) {
        return new ArrayList<>();
    }
}
