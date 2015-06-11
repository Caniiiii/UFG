package br.com.acoesprojetos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acoesprojetos.service.UsuarioService;

@WebServlet(name = "CadastroServlet", urlPatterns = "/login/cadastroUsuario")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		try {
			String operacao = req.getParameter("cadastro");
			
			if (operacao.equals("salvar")) {
				String nome = req.getParameter("nome");
				String login = req.getParameter("login");
				String senha = req.getParameter("senha");
				String email = req.getParameter("mail");

				UsuarioService usuarioService = new UsuarioService();
				usuarioService.salvar(nome, login, senha, email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			req.getRequestDispatcher("/login/index.html").forward(req, resp);
		}

	}

}
