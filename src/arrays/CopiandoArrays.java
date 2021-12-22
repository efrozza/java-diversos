package arrays;

public class CopiandoArrays {
	
	public static void main(String[] args) {
		
		int[] origem = {1, 2, 3, 4, 5};
		int[] destino1 = new int[8];
		int[] destino2 = new int[4];
		
		// de qual array, a partir de qual posicao, qual array destino, quantas posicoes
		System.arraycopy(origem, 2, destino1, 6, 2);
		
		for (int i=0; i < destino1.length; i++) {
			System.out.println("destino 1 " + destino1[i]);			
		}
		
		
	}

}
