<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valor da �rea</title>
</head>
<body>

<%

	String strMensagem;
	int intTipoFigura = Integer.parseInt(request.getParameter("TipoFigura"));
	double dblArea = Float.parseFloat(request.getParameter("ValorArea"));
	
	if(intTipoFigura == 1)
		strMensagem = "Valor da �rea do ret�ngulo �: "+dblArea;
		else if(intTipoFigura == 2)
			strMensagem = "Valor da �rea da circunfer�ncia �: "+dblArea;
		else if(intTipoFigura == 3)
			strMensagem = "Valor da �rea do tri�ngulo ret�ngulo �: "+dblArea;
			else
				strMensagem = "Valor da �rea do tri�ngulo ret�ngulo �: "+dblArea;
%>

<h2><%= strMensagem %></h2>

</body>
</html>