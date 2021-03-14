package servlet_calculos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcularAreas")
public class calcularAreas extends HttpServlet {
	
	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int intFiguraGeometrica;
		String strURL = "/parametros_calculo.jsp";
		
		if(request.getParameter("TipoFigura") != null)
			intFiguraGeometrica = Integer.parseInt(request.getParameter("TipoFigura"));
		else
			intFiguraGeometrica = 0;
		
		request.setAttribute("Tipo", new Integer(intFiguraGeometrica));
		RequestDispatcher Despachante = getServletContext().getRequestDispatcher(strURL);
		Despachante.forward(request, response);
	}
}
