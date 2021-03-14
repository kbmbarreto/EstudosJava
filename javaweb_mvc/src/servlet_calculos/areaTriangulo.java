package servlet_calculos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/areaTriangulo")
public class areaTriangulo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int intAltura, intLargura, intArea;
		String strURL;
		
		if(request.getParameter("fldAltura") != null)
			intAltura = Integer.parseInt(request.getParameter("fldAltura"));
		else
			intAltura = 0;
		
		if(request.getParameter("fldLargura") != null)
			intLargura = Integer.parseInt("fldLargura");
		else
			intLargura = 0;
		
		if((intAltura != 0) && (intLargura != 0))
			intArea = (intAltura * intLargura) / 2;
		else
			intArea = 0;
		
		strURL = "/resultado_area.jsp?TipoFigura=1&ValorArea="+intArea;
		RequestDispatcher Despachante = getServletContext().getRequestDispatcher(strURL);
		Despachante.forward(request, response);
	}
}
