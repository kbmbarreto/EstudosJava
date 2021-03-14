<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cálculo da área de um trapézio - JSP</title>
</head>
<body>

<%
	int intBaseMenor, intBaseMaior, intAltura, intArea;
	intBaseMenor = Integer.parseInt(request.getParameter("base_menor"));
	intBaseMaior = Integer.parseInt(request.getParameter("base_maior"));
	intAltura = Integer.parseInt(request.getParameter("altura"));
	intArea = ((intBaseMenor + intBaseMaior) * intAltura) / 2;
%>

<h2>Valor da área do trapézio: <%= intArea %></h2>

</body>
</html>