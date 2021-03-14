<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="model.c_usuarios" %>
<jsp:useBean id="conexao" scope="page" class="banco_dados.conexaoBancoDados" />
<jsp:useBean id="usuario" scope="page" class="banco_dados.usuarios" />
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>SGC - Versão 1.0</title>
	<link href="clinica_medica.css" rel="stylesheet" type="text/css" />
</head>
<body class="FundoPagina">

<%

	ResultSet rsRegistro;
	boolean blnConectado;
	
	c_usuarios Usuario = new c_usuarios();
	int intCodigoUsuario = Integer.parseInt(request.getParameter("codigo_usuario"));
	blnConectado = false;
	
	if(conexao.abrirConexao()) {
		usuario.configurarConexao(conexao.obterConexao());
		
		rsRegistro = usuario.lerRegistro(intCodigoUsuario);
		
		Usuario.setIdUsuario(rsRegistro.getString("Identificacao_Usuario"));
		Usuario.setSenhaAcesso(rsRegistro.getString("Senha_Acesso"));
		Usuario.setCadastroFuncionario(rsRegistro.getString("Cadastro_Funcionario"));
		Usuario.setCadastroUsuario(rsRegistro.getString("Cadastro_Usuario"));
		Usuario.setCadastroPaciente(rsRegistro.getString("Cadastro_Paciente"));
		Usuario.setCadastroEspecialidade(rsRegistro.getString("adastro_Especialidade"));
		Usuario.setCadastroMedico(rsRegistro.getString("Cadastro_Medico"));
		Usuario.setCadastroConvenio(rsRegistro.getString("Cadastro_Convenio"));
		Usuario.setAgendamentoConsulta(rsRegistro.getString("Agendamento_Consulta"));
		Usuario.setCancelamentoConsulta(rsRegistro.getString("Cancelamento_Consulta"));
		Usuario.setModuloAdministrativo(rsRegistro.getString("Modulo_Administrativo"));
		Usuario.setModuloAgendamento(rsRegistro.getString("Modulo_Agendamento"));
		Usuario.setModuloAtendimento(rsRegistro.getString("Modulo_Atendimento"));
		Usuario.setCodigoUsuario(intCodigoUsuario);
		
		conexao.fecharConexao();
		
		blnConectado = true;
	} else {
		out.println("<p>Falha na conexão com o banco de dados!</p>");
	}

%>

<% if(blnConectado) {%>


</body>
</html>