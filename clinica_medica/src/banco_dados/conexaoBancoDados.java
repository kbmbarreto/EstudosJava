package banco_dados;

import java.sql.*;

public class conexaoBancoDados {
	
	Connection conBanco;
	
	public boolean abrirConexao() {
		String url = "jdbc:mysql://localhost/clinica_medica?user=root&password=Dev2020@";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conBanco = DriverManager.getConnection(url);
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public boolean fecharConexao() {
		try {
			conBanco.close();
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public Connection obterConexao() {
		return conBanco;
	}
}
