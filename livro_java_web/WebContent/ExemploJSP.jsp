<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo de uso de elementos sint�ticos de JSP</title>
</head>
<body>
<%! int intContaAcesso = 0; %>
<%
	java.util.Date DataAtual = new java.util.Date();
		String strData = new SimpleDateFormat("ss/MM/yyyy").format(DataAtual);
%>
<h2>Data atual: <%= strData %></h2><br>
<%
	out.println("<h2>Contagem de atualiza��es da p�gina</h2><br>");
	intContaAcesso++;
%>
<h2>N�mero de vezes que voc� acessou/atualizou esta p�gina: <%= intContaAcesso %>.</h2>
</body>
</html>