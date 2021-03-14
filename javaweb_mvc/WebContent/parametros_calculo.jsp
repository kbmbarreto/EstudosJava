<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Parâmetros para cálculo da área</title>
</head>
<body>

<%

	String strTituloFormulario, strFormulario;

	int intFiguraGeometrica = (Integer) request.getAttribute("Tipo");
	
	if(intFiguraGeometrica == 1) {
		strTituloFormulario = "Cálculo da área de um retângulo";
		strFormulario = "<form name='formCalculoAreasFiguras' method='get' action='areaRetangulo'>";
	} else if(intFiguraGeometrica == 2) {
		strTituloFormulario = "Cálculo da área de uma circunferência";
		strFormulario = "<form name='formCalculoAreasFiguras' method='get' action='areaCircunferencia'>";
	} else if(intFiguraGeometrica == 3) {
		strTituloFormulario = "Cálculo da área de um triângulo retângulo";
		strFormulario = "<form name='formCalculoAreasFiguras' method='get' action='areaTriangulo'>";
	} else {
		strTituloFormulario = "** Erro **";
		strFormulario = "<form name='formCalculoAreasFiguras'>";
	}
	
	out.println(strFormulario);
	
%>

<h2 style="text-align: center;"><%= strTituloFormulario %></h2>

<%

	if((intFiguraGeometrica == 1) || (intFiguraGeometrica == 3)) {
		out.println("Digite o valor da altura:");
		out.println("<input name='fldAltura' type='text' size='8' maxlength='8' />");
		out.println("</p>");
		
		out.println("<p>Digite o valor da largura:");
		out.println("<input name='fldLargura' type='text' size='8' maxlength='8'/>");
		out.println("</p>");
	} else if(intFiguraGeometrica == 2) {
		out.println("<p>Digite o valor do raio da circunferência:");
		out.println("<input name='fldLargura' type='text' size='8' maxlength='8'/>");
		out.println("</p>");
	} else out.println("<h2>Deve ser especificado o tipo de figura!</h2>");

%>

<p>
	<input type="submit" name="btnCalcular" value="Calcular" />
</p>

</body>
</html>