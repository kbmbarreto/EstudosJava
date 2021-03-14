<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="conexao" scope="page"
	class="banco_dados.conexaoBancoDados" />
<jsp:useBean id="especialidade" scope="page"
	class="banco_dados.especialidades" />
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Conexão com o banco de dados</title>
</head>
<body>

	<h2>Conexão com banco de dados</h2>

	<%
	if (conexao.abrirConexao()) {
		especialidade.configurarConexao(conexao.obterConexao());

		if (especialidade.inserirRegistro("Clinica Geral"))
			out.println("<h2>Especialidade 'Clinica Geral' cadastrada com sucesso!</h2>");
		else
			out.println("<h3>Erro ao tentar cadastrar especialidade!</h3>");
		conexao.fecharConexao();
	} else
		out.println("<p>Falha na conexão com o banco de dados!</p>");
	%>

</body>
</html>