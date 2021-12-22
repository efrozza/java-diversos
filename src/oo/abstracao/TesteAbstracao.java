package oo.abstracao;

public class TesteAbstracao {

    public static void main(String[] args) {
        // nao posso instanciar classe abstrata
        Cachorro cachorro = new PitBull();
        cachorro.latir();
    }
}
