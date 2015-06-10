package br.com.acoesprojetos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "BoasVindas", urlPatterns = "/bemvindo")
public class TerceiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String salario = request.getParameter("salario");
		String percentual = request.getParameter("percentual");
		
		Double salarioD = Double.parseDouble(salario);
		Double percentualD = Double.parseDouble(percentual);
		
		Double aumento = salarioD*percentualD/100;
		Double novoSalario = salarioD+aumento;
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Meu servlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<br/>Nome do funcionario: " + nome);
		out.println("<br/>Salario: " + salario);	
		out.println("<br/>Percentual de aumento: " + percentual);	
		out.println("<br/>Novo Salario: " + novoSalario);	
		out.println("</body>");
		out.println("</html>");
	}

}
