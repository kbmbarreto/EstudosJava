<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cálculo de áreas de figuras geométricas - Login</title>
</head>
<body>

	<%@page import="javax.servlet.http.*"%>>

	<%
	HttpSession sessao = request.getSession();

	if (sessao.getAttribute("usuario_logado") == null)
		sessao.setAttribute("usuario_logado", "false");

	if (sessao.isNew() || sessao.getAttribute("usuario_logado").equals("false")) {
		out.println("<form action='executar_login' method='post'>");
		out.println("Usuario: <input type='text' name='senha' size='20' maxlength='15'><br><br>");
		out.println("Senha: <input type='password' name='senha' size='15' maxlength='15'<br><br>");
		out.println("<input type='submit' value='Entrar'>");
		out.println("</form>");
		out.println("<br><br>");
	} else {
		out.println("<h2>Olá " + session.getAttribute("nome_usuario") + "!</h2>");
		out.println("<a href='calcular_areas_sessao.html'>Calcular áreas</a>");
	}
	%>

</body>
</html>