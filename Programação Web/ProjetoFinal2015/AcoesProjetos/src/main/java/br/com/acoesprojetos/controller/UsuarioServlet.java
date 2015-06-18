package br.com.acoesprojetos.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.acoesprojetos.model.Usuario;
import br.com.acoesprojetos.service.UsuarioService;

@WebServlet(name = "CadastroServlet", urlPatterns = "/login/cadastroUsuario")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		try {
			String operacao = req.getParameter("cadastro");
			UsuarioService usuarioService = new UsuarioService();

			if (operacao.equals("Entrar")) {
				String login = req.getParameter("login_usuario");
				String senha = req.getParameter("login_senha");

				Usuario usuario = new Usuario();
				List<Usuario> listaDeUsuarios = usuarioService.listar();
				boolean usuarioValido = false;

				for (int i = 0; i < listaDeUsuarios.size(); i++) {
					usuario = usuarioService.buscarPorId(i);
					if (usuario.getLogin().equals(login)
							&& usuario.getSenha().equals(senha)) {
						HttpSession session = req.getSession();
						session.setAttribute("usuario_logado", usuario);
						usuarioValido = true;
						req.getRequestDispatcher("/temp/index.jsp").forward(
								req, resp);
						break;
					}
				}

				if (!usuarioValido) {
					req.setAttribute("mensagem", "Usuário ou Senha Invalidos");
				}
			} else if (operacao.equals("salvar")) {
				Usuario usuario = new Usuario();
				usuario.setNome(req.getParameter("nome"));
				usuario.setLogin(req.getParameter("login"));
				usuario.setSenha(req.getParameter("senha"));
				usuario.setEmail(req.getParameter("mail"));
				
				DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date inicio = (Date) formatter.parse(req.getParameter("nascimento"));
				usuario.setDataNasc(inicio);

				usuarioService.salvar(usuario);
				req.setAttribute("mensagem", "Usuário Cadastrado Com Sucesso");
				req.getRequestDispatcher("/login/index.html").forward(req, resp);
			} else {
				req.setAttribute("mensagem", "Erro na Página");
				req.getRequestDispatcher("/temp/index.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
