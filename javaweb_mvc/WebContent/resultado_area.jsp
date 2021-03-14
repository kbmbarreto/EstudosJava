<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valor da área</title>
</head>
<body>

<%

	String strMensagem;
	int intTipoFigura = Integer.parseInt(request.getParameter("TipoFigura"));
	double dblArea = Float.parseFloat(request.getParameter("ValorArea"));
	
	if(intTipoFigura == 1)
		strMensagem = "Valor da área do retângulo é: "+dblArea;
		else if(intTipoFigura == 2)
			strMensagem = "Valor da área da circunferência é: "+dblArea;
		else if(intTipoFigura == 3)
			strMensagem = "Valor da área do triângulo retângulo é: "+dblArea;
			else
				strMensagem = "Valor da área do triângulo retângulo é: "+dblArea;
%>

<h2><%= strMensagem %></h2>

</body>
</html>