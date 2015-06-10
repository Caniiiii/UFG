package br.com.acoesprojetos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Formulario", urlPatterns="/formulario")
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Meu servlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Seu nome:"+ nome);
		out.println("<br/>Sua senha:"+ senha);
		out.println("</body>");
		out.println("</html>");
	}

}
