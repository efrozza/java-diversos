package textos;

import org.junit.jupiter.api.Test;

class ImprimePrimeiroCaracterPalavraTest {


    @Test
    void testeFraseComApenasUmEspacoPorPalavra(){
        ImprimePrimeiroCaracterPalavra imprimePrimeiroCaracterPalavra = new ImprimePrimeiroCaracterPalavra("Uma Palavra Letra");
        imprimePrimeiroCaracterPalavra.execute();
    }

    @Test
    void testeFraseComVariosEspacosEntreAsPalavras(){
        ImprimePrimeiroCaracterPalavra imprimePrimeiroCaracterPalavra = new ImprimePrimeiroCaracterPalavra("   Uma   Palavra   Letra");
        imprimePrimeiroCaracterPalavra.execute();
    }

    @Test
    void testeFraseComPrimeiroCharEspaco(){
        ImprimePrimeiroCaracterPalavra imprimePrimeiroCaracterPalavra = new ImprimePrimeiroCaracterPalavra(" Uma Palavra Letra");
        imprimePrimeiroCaracterPalavra.execute();
    }

}