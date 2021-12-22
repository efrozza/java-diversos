package oo;

import java.util.Objects;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {

		// verifica se o object recebi é um Usuario
		if (objeto instanceof Usuario) {
			// cast de object para Usuario
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			return nomeIgual && emailIgual;

		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, email);
	}
}
