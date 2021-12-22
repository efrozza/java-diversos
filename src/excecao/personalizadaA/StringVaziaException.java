package excecao.personalizadaA;

// para criar uma exec��o a classe deve extender a classe de exce��o do java
public class StringVaziaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String nomeDoAtributo = "";

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;

	}

	public String getMessage() {

		return String.format("O atributo %s est� vazio", nomeDoAtributo);
	}

}
