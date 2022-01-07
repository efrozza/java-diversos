package casesOO.coesao;

public class CalculadoraDeRake {

    public double calculaRake (final JogoDePoker jogo, final String modalidade, final double valor) {
        if  ("TEXAS".equalsIgnoreCase(jogo.nome)){
            if  ("MTT".equalsIgnoreCase(modalidade)){
                return valor * 0.10;
            } else {
                return 0.0;
            }
        } else {
            return 0.0;
            
        }
    }

}
