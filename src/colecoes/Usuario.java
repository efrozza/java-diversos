package colecoes;

import java.util.Objects;

public class Usuario {

	private String nome;

	public String toString() {

		return "Meu nome é " + this.getNome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Usuario)) return false;
		Usuario usuario = (Usuario) o;
		return getNome().equals(usuario.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNome());
	}
}
