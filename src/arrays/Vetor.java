package arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona (String elemento){
        this.elementos[this.getTamanho()] = elemento;
        this.setTamanho(this.getTamanho() + 1);

    }
    public String busca(int posicao){
        return this.elementos[posicao];
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public int getTamanho() {
        return this.tamanho;
    }

}
