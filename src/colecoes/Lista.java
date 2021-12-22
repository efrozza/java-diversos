package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		// A lista é ordenada por ordem de inserção
		// aceita duplicados
		// cria a lista
		ArrayList<Usuario> listagem = new ArrayList<>();

		// cria instancia do objeto que sera adicionado na lista
		Usuario usuario1 = new Usuario("Everton");

		// adiciona na lista
		listagem.add(usuario1);
		
		Usuario usuarioContains = new Usuario("Teste contains");
		
		listagem.add(usuarioContains);

		// criando a instancia no momento de adicionar
		listagem.add(new Usuario("Vanessa"));
		listagem.add(new Usuario("Leticia"));
		listagem.add(new Usuario("Teste1"));
		listagem.add(new Usuario("Teste2"));
		listagem.add(new Usuario("Teste3"));

		// remover
		System.out.println("Elemento removido" + listagem.remove(0));

		// percorre a lista devolvendo dados do seu tipo , no caso usuario
		// a ordem de inserção é mantida
		
		Lista lista = new Lista();
		lista.listarUsuarios(listagem);

		// obtendo valor indexado
		System.out.println(listagem.get(1).getNome());

		// ustando toString chamando implicitamente
		System.out.println(listagem.get(1));

		// remover pelo objeto
		listagem.remove(new Usuario("Teste3"));

		lista.listarUsuarios(listagem);
		
		//verificar se está contido
		System.out.println(listagem.contains(new Usuario("Leticia")));
		System.out.println(listagem.contains(usuarioContains));

	}

	void listarUsuarios(ArrayList<Usuario> usuarios) {
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}

	}

}
