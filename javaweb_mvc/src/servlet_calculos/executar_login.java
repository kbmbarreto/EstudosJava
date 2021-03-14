package servlet_calculos;

import java.io.*;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/executar_login")
public class executar_login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out;
		response.setContentType("text/html");
		out = response.getWriter();
		HttpSession sessao = request.getSession();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cálculo de áreas de figuras geométricas</title>");
		out.println("</head>");
		out.println("<body>");
		
		if(request.getParameter("usuario").equals("jsp") && request.getParameter("senha").equals("123456")) {
			sessao.setAttribute("usuario_logado", "true");
			sessao.setAttribute("nome_usuario", request.getParameter("usuario"));
			out.println("<h2>Bem-vindo "+request.getParameter("usuario")+"</h2>");
			out.println("<br><br>");
			out.println("<a href='calcular_areas_sessao.html'>Calcular áreas</a>");
		} else {
			out.println("<p>Usuário ou senha inválidos</p>");
			out.println("<a href='login.jsp'>Tentar novamente</a>");
		}
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out;
		response.setContentType("text/html");
		
		out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cálculo de áreas de figuras geométricas</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Sessão encerrada...</p>");
		out.println("<p>Obrigado, e até logo!</p>");
		out.println("</body>");
		out.println("</html>");
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("usuario_logado", null);
		sessao.invalidate();
	}

}
