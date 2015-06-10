package br.com.acoesprojetos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acoesprojetos.dao.UsuarioDAO;
import br.com.acoesprojetos.model.Usuario;

public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsuarioServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario();
		String nome = (String)request.getAttribute("nome");
		usuario.setNome(nome);
		
		String email = (String)request.getAttribute("mail");
		usuario.setNome(email);
		
		String login = (String)request.getAttribute("login");
		usuario.setNome(login);
		
		String senha = (String)request.getAttribute("senha_conf");
		usuario.setNome(senha);
		
		UsuarioDAO  usuarioDAO = new UsuarioDAO();
		usuarioDAO.inserir(usuario);
		System.out.println("salvou");
		
		request.setAttribute("usuario", usuario);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}
