package oo.heranca;

public enum FaixaImc {

    ABAIXO("Abaixo do peso",
            19,
            21 ),
    NORMAL("Peso Normal", 26, 27),
    ACIMA("Acima do peso", 100, 100);

	protected String descricao;
	protected int limiteMaximoFeminino;
    protected int limiteMaximoMasculino;

    FaixaImc(String s, int limiteMaximoFeminino, int limiteMaximoMasculino) {
    	this.descricao = s;
    	this.limiteMaximoFeminino = limiteMaximoFeminino;
    	this.limiteMaximoMasculino = limiteMaximoMasculino;
    }

    public static FaixaImc getFaixa(double imc, Sexo sexo){
    	
    	// values é um array com todos os dados do enum
        FaixaImc retorno = values()[0];

        for (int i=1; i < values().length; i++){

            FaixaImc atual = values()[i];
            FaixaImc anterior = values()[i-1];
            
            int limiteInferior = (sexo == Sexo.FEMININO) ? anterior.limiteMaximoFeminino : anterior.limiteMaximoMasculino;
            int limiteSuperior = (sexo == Sexo.FEMININO) ? atual.limiteMaximoFeminino : atual.limiteMaximoMasculino;

            if (imc >= limiteInferior && imc < limiteSuperior){
                retorno = atual;
            }

        }

        return retorno;

    }

}
