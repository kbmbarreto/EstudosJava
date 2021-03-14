package banco_dados;

import java.sql.*;
import model.c_usuarios;

public class usuarios {

	private Connection conBanco;
	private PreparedStatement psComando;
	private ResultSet rsRegistros;
	
	public void configurarConexao(Connection conBanco) {
		this.conBanco = conBanco;
	}
	
	public boolean inserirRegistro(c_usuarios usuario) {
		String strComandoSQL;
		
		try {
			strComandoSQL = "INSERT INTO usuarios(Identificacao_Usuario, Senha_Acesso, +"
					+ "Cadastro_Funcionario, Cadastro_Usuario, Cadastro_Paciente, Cadastro_Especialidade,+"
					+ "Cadastro_Medico, Cadastro_Convenio, Agendamento_Consulta, Cancelamento_Consulta, +"
					+ "Modulo_Administrativo, Modulo_Agendamento, Modulo_Atendimento)"+
					"VALUES ('"+
					usuario.getIdUsuario()+"',"+
					usuario.getSenhaAcesso()+"','"+
					usuario.getCadastroFuncionario()+"','"+
					usuario.getCadastroPaciente()+"','"+
					usuario.getCadastroEspecialidade()+"','"+
					usuario.getCadastroMedico()+"','"+
					usuario.getCadastroConvenio()+"','"+
					usuario.getAgendamentoConsulta()+"',+"+ "'"+
					usuario.getCancelamentoConsulta()+"','"+
					usuario.getModuloAdministrativo()+"','"+
					usuario.getModuloAgendamento()+"','"+
					usuario.getModuloAtendimento()+"')";
			psComando = conBanco.prepareStatement(strComandoSQL);
			psComando.executeUpdate();
			
			return true;
			
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public int localizarRegistro(String strUsuario) {
		int intCodigoUsuario = 0;
		String strComandoSQL;
		
		try {
			strComandoSQL = "SELECT Registro_Usuario FROM usuarios WHERE identificacao_Usuario = '"+strUsuario+"'";
			psComando = conBanco.prepareStatement(strComandoSQL);
			rsRegistros = psComando.executeQuery();
			rsRegistros.next();
			
			intCodigoUsuario = rsRegistros.getInt("Registro_Usuario");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return intCodigoUsuario;
	}
	
	public ResultSet lerRegistro(int intCodigoUsuario) {
		String strComandoSQL;
		
		try {
			strComandoSQL = "SELECT * FROM usuarios WHERE Registro_Usuario = "+intCodigoUsuario;
			psComando = conBanco.prepareStatement(strComandoSQL);
			rsRegistros = psComando.executeQuery();
			rsRegistros.next();
			
			return rsRegistros;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public boolean alterarRegistro(c_usuarios usuario) {
		String strComandoSQL;
		
		try {
			strComandoSQL = "UPDATE usuarios SET Identificacao_Usuario = '"+
					usuario.getIdUsuario()+"',"+"Senha_Acesso = '"+
					usuario.getSenhaAcesso()+"',"+
					usuario.getCadastroFuncionario()+"',"+
					usuario.getCadastroUsuario()+"',"+
					usuario.getCadastroPaciente()+"',"+
					usuario.getCadastroEspecialidade()+"',"+
					usuario.getCadastroMedico()+"',"+
					usuario.getCadastroConvenio()+"',"+
					usuario.getAgendamentoConsulta()+"',"+
					usuario.getCancelamentoConsulta()+"',"+
					usuario.getModuloAdministrativo()+"',"+
					usuario.getModuloAgendamento()+"',"+
					usuario.getModuloAtendimento()+"',"+
					"WHERE Registro_Usuario = "+
					usuario.getCodigoUsuario();
			psComando = conBanco.prepareStatement(strComandoSQL);
			psComando.executeUpdate();
			
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public boolean excluirRegistro(int intCodigoUsuario) {
		
		String strComandoSQL;
		
		try {
			strComandoSQL = "DELETE FROM usuarios WHERE Registro_Usuario = "+intCodigoUsuario;
			psComando = conBanco.prepareStatement(strComandoSQL);
			psComando.executeUpdate();
			
			return true;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
