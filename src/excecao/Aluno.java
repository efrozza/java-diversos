package excecao;

public class Aluno {

	private String nome = "";
	private float nota = 0.0F;
	
	public Aluno(String nome, float nota){
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

}
