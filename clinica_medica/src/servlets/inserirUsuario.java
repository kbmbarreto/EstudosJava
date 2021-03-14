package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import banco_dados.*;
import model.c_usuarios;


@WebServlet("/inserirUsuario")
public class inserirUsuario extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String strIDUsuario, strSenha, strAdministrativo, strFuncionario, strUsuario, strEspecialidade, strMedico, strConvenio,
		strAgendamento, strPaciente, strAgendarConsulta, strCancelarConsulta, strAtendimento;
		PrintWriter out;
		
		strIDUsuario = request.getParameter("txtUsuario");
		strSenha = request.getParameter("txtSenha");
		
		if(request.getParameter("chkAdministrativo") != null)
		strAdministrativo = "S";
		else
			strAdministrativo ="N";
		
		if(request.getParameter("chkFuncionario") != null)
			strFuncionario = "S";
		else
			strFuncionario = "N";
		
		if(request.getParameter("chkUsuario") != null)
			strUsuario = "S";
		else
			strUsuario = "N";
		
		if(request.getParameter("chkEspecialidade") != null)
			strEspecialidade = "S";
		else
			strEspecialidade = "N";

		if(request.getParameter("chkMedico") != null)
			strMedico = "S";
		else
			strMedico = "N";

		if(request.getParameter("chkConvenio") != null)
			strConvenio = "S";
		else
			strConvenio = "N";
		
		if(request.getParameter("chkAgendamento") != null)
			strAgendamento = "S";
		else
			strAgendamento = "N";
		
		if(request.getParameter("chkPaciente") != null)
			strPaciente = "S";
		else
			strPaciente = "N";
		
		if(request.getParameter("chkAgendarConsulta") != null)
			strAgendarConsulta = "S";
		else
			strAgendarConsulta = "N";
		
		if(request.getParameter("chkCancelarConsulta") != null)
			strCancelarConsulta = "S";
		else
			strCancelarConsulta = "N";
		
		if(request.getParameter("chkAtendimento") != null)
			strAtendimento = "S";
		else
			strAtendimento = "N";
		
		response.setContentType("text/html; charset=UTF-8");
		out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
		out.println("<title>SGC - Vers�o 1.0</title>");
		out.println("<link href='clinica_medica.css' rel='stylesheet' type='text/css' />");
		out.println("</head>");
		out.println("<body class='FundoPagina'>");
		out.println("<p class='TituloAplicacao'>SGC - Sistema de Gest�o de Cl�nicas 1.0</p>");
		out.println("<p class='TituloPagina'>Cadastro de Usu�rios</p>");
		
		try {
			
			conexaoBancoDados conexao = new conexaoBancoDados();
			usuarios usuario = new usuarios();
			
			c_usuarios Usuario = new c_usuarios(
					strIDUsuario.toUpperCase(),
					strSenha.toUpperCase(),
					strAdministrativo,
					strFuncionario,
					strUsuario,
					strEspecialidade,
					strMedico,
					strConvenio,
					strAgendamento,
					strPaciente,
					strAgendarConsulta,
					strCancelarConsulta,
					strAtendimento,
					0);
			
			if(conexao.abrirConexao()) {
				usuario.configurarConexao(conexao.obterConexao());
				
				if(usuario.inserirRegistro(Usuario)) {
					out.println("<h2>Usu�rio cadastrado com sucesso!</h2>");
					out.println("<br><br><br><br>");
					out.println("<a href='menu_usuarios.html'>Voltar</a>");
				}
				else
				out.println("<h2>N�o foi poss�vel cadastrar o usu�rio!</h2>");
				conexao.fecharConexao();
			}
			else
				out.println("<h2>N�o foi poss�vel estabelecer conex�o com o banco de dados!</h2>");
			
		} catch(Exception ex) {
			ex.printStackTrace();
			out.println("<h2>Erro do sistema: processo de cadastro de usu�rio!</h2>");
		}
		
		out.println("<p class='RodapePagina'>Copyright(c) 2021 - KMACEDO Consultoria em TI</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
