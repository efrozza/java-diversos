package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() {

		try {
			String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
			String usuario = "root";
			String senha = "123456";

			Connection conexao = DriverManager.getConnection(url, usuario, senha);

			return conexao;
		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}

}
