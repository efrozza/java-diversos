package generics;

// classe generica , seu tipo sera definido no momento da instancia��o
public class Caixa<T> {

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}

}
