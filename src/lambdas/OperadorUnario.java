package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois   = parametroASerSomado -> parametroASerSomado + 2;
        UnaryOperator<Integer> vezesDois  = parametroASerMultiplicado -> parametroASerMultiplicado + 2;
        UnaryOperator<Integer> aoQuadrado = parametroASerElevado -> parametroASerElevado * parametroASerElevado;

        int resultadoConcatenacaoFuncoes = maisDois
                        .andThen(vezesDois)
                        .andThen(aoQuadrado)
                        .apply(2);
        System.out.println("Resultado da chamada encadeada de funções " + resultadoConcatenacaoFuncoes);

        int resultadoUsandoCompose = aoQuadrado
                                    .compose(maisDois)
                                    .compose(vezesDois)
                                    .apply(0);

        System.out.println("Resultado da chamada encadeada de funções " + resultadoUsandoCompose);

    }
}
