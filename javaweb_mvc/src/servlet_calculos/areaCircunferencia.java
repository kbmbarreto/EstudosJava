package servlet_calculos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/areaCircunferencia")
public class areaCircunferencia extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int intRaio;
		double dblArea;
		String strURL;
		
		if(request.getParameter("fldRaio") != null)
			intRaio = Integer.parseInt(request.getParameter("fldRaio"));
		else
			intRaio = 0;
		
		dblArea = (intRaio * intRaio) * 3.14151692;
		
		strURL = "/resultado_area.jsp?TipoFigura=1&ValorArea="+dblArea;
		RequestDispatcher Despachante = getServletContext().getRequestDispatcher(strURL);
		Despachante.forward(request, response);
	}
}
