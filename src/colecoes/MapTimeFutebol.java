package colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapTimeFutebol {
	
	public static void main(String[] args) {
		
		Map<Integer, String> timeFutebol = new HashMap<>();
		timeFutebol.put(1, "Alisson");
		timeFutebol.put(10, "Neymar");
		timeFutebol.put(5, "Casemiro");
		
		for (String jogador : timeFutebol.values()) {
			System.out.println(jogador);
		}
		
		
		
	}

}
