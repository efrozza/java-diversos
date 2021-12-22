package oo.composicao;

public class CursoTeste {
	
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Cobol");
		Curso curso3 = new Curso("Node");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno3);
		
		// relaçãop bidirecional
		// posso adicioanr aluno em curso e curso em aluno
		aluno3.adicionarCurso(curso1);
		aluno3.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso3);
		
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1" );
			System.out.println("Meu nome é " + aluno.nome);
			
		}
	}

	
	

}
