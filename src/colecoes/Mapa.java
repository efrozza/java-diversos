package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		//Map faz chave e valor		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		
		//o put altera caso ja exista ou inclui, caso nao exista
		usuarios.put(20, "Ricardo");
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Joana");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		// busca pela chave
		System.out.println(usuarios.containsKey(20));

		// busca por um valor de chave
		System.out.println(usuarios.containsValue("Joana"));

		// obtem item pela chave
		System.out.println(usuarios.get(20));

		// lista todas as chaves do map
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}

		// lista todas os valores do map
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}

		// lista chave e valor do map
		for (Entry<Integer, String> registro: usuarios.entrySet()){
			System.out.println("chave " + registro.getKey());
			System.out.println("valor " + registro.getValue());
		}

		// remove item pela chave
		usuarios.remove(1);

		for (Entry<Integer, String> registro: usuarios.entrySet()){
			System.out.println("chave " + registro.getKey());
			System.out.println("valor " + registro.getValue());
		}

	}

}
