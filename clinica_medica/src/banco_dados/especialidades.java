package banco_dados;

import java.sql.*;

public class especialidades {
	
	private Connection conBanco;
	private PreparedStatement psComando;
	private ResultSet rsRegistros;
	
	public void configurarConexao(Connection conBanco) {
		this.conBanco = conBanco;
	}

	public boolean inserirRegistro(String strDescricao) {
		String strComandoSQL;
		
		try {
			strComandoSQL = "INSERT INTO especialidade(Descricao_Especialidade) VALUES('"+strDescricao+"')";
			psComando = conBanco.prepareStatement(strComandoSQL);
			psComando.executeUpdate();
			
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}	
	}
	
	public boolean alterarRegistro(int intCodigo, String strDescricao) {
		String strComandoSQL;
		
		try {
			strComandoSQL = "UPDATE especialidade SET Descricao_Especialidade = '"+strDescricao+"' WHERE Codigo_Especialidade = "+intCodigo;
			psComando = conBanco.prepareStatement(strComandoSQL);
			psComando.executeUpdate();
			
			return true;
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public boolean excluirRegistro(int intCodigo) {
		String strComandoSQL;
		
		try {
			strComandoSQL = "DELETE FROM especialidade WHERE Codigo_Especialidade = '"+intCodigo+"' WHERE Codigo_Especialidade = "+intCodigo;
			psComando = conBanco.prepareStatement(strComandoSQL);
			psComando.executeUpdate();
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public ResultSet listarRegistros(String strOrdem) {
		String strComandoSQL;
		
		try {
			if(strOrdem == "CÓDIGO")
				strComandoSQL = "SELECT * FROM especialidade ORDER BY Codigo_Especialidade";
			else
				strComandoSQL = "SELECT * FROM especialidade ORDER BY Descricao_Especialidade";
			rsRegistros = psComando.executeQuery();
			return rsRegistros;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}