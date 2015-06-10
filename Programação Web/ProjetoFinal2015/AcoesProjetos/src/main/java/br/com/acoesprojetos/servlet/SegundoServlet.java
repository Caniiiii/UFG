package br.com.acoesprojetos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SegundoServlet", urlPatterns = "/SegundoServlet")
public class SegundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Meu servlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Nome da aplica��o " + request.getContextPath());
		out.println("<br/>Nome da Maquina Local " + request.getLocalName());
		out.println("<br/>Endere�o da Maquina Local " + request.getLocalAddr());
		out.println("<br/>Porta da Maquina Local " + request.getLocalPort());
		out.println("<br/>Nome do Servidor " + request.getRemoteHost());
		out.println("<br/>Endere�o do servidor " + request.getRemoteAddr());
		out.println("<br/>Porta do Servidor " + request.getRemotePort());
		out.println("<br/>M�todo de requisi��o " + request.getMethod());
		out.println("<br/>Protocolo Utilizado " + request.getProtocol());
		out.println("<br/>Codifica��o da pagina " + request.getCharacterEncoding());
		out.println("<br/>Tamanho do conteudo " + request.getContentLength());
		out.println("<br/>ID da sess�o " + request.getRequestedSessionId());
		out.println("<br/>Cookies: " + request.getCookies());
		out.println("<br/>Nome da Sessao " + request.getSession());
		out.println("<br/>Nome da servlet " + request.getServletContext());
		out.println("</body>");
		out.println("</html>");
	}

}
