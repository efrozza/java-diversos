package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// hashset nao aceita repetido, simplesmente despreza

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(10);
		conjunto.add("X");
		conjunto.add(1);

		// tamanho do conjunto
		System.out.println("Tamanho eh " + conjunto.size());

		// n eh repetido pq eh case censistive
		conjunto.add("teste");

		// repetido
		conjunto.add(10);

		System.out.println("Tamanho eh " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho eh " + conjunto.size());

		// verifica se existe no conjunto
		System.out.println(conjunto.contains(1.2));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);

		// uniao entre dois conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);

		// intersecção
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		// limpar conjunto
		conjunto.clear();
		System.out.println(conjunto);

	}

}
