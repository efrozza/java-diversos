package colecoes;

import java.util.Objects;

public class AulaSemComparable{

	private String titulo;
	private int tempo;

	public AulaSemComparable(){

	}

	public AulaSemComparable(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula " + this.titulo + ", " + this.tempo;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof AulaSemComparable)) return false;
		AulaSemComparable that = (AulaSemComparable) o;
		return getTitulo().equals(that.getTitulo());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTitulo());
	}
}
