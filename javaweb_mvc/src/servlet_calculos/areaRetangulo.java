package servlet_calculos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/areaRetangulo")
public class areaRetangulo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int intAltura,intLargura, intArea;
		String strURL;
		
		if(request.getParameter("fldAltura") != null)
			intAltura = Integer.parseInt(request.getParameter("fldAltura"));
		else
			intAltura = 0;
		
		if(request.getParameter("fldLargura") != null)
			intLargura = Integer.parseInt(request.getParameter("fldLargura"));
		else
			intLargura = 0;
		
		intArea = intAltura * intLargura;
		
		strURL = "/resultado_area.jsp?TipoFigura=1&ValorArea="+intArea;
		RequestDispatcher Despachante = getServletContext().getRequestDispatcher(strURL);
		Despachante.forward(request, response);
	}

}
