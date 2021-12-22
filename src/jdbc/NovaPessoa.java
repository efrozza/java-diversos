package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o nome:");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		// cada ? do sql é um parametro em ordem
		// entao abaixo estamos falando queno ? = 1 (NO PRIMEIRO) o valor é a variavel nome
		stmt.setString(1, nome);
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		
		entrada.close();
		
	}

}
