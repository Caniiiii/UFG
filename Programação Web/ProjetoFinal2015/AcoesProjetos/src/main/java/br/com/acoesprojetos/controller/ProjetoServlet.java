package br.com.acoesprojetos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acoesprojetos.service.ProjetoService;

@WebServlet(name = "ProjetoServlet", urlPatterns = "/temp/cadastroProjeto")
public class ProjetoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		try {
			String operacao = req.getParameter("cadastro");
			ProjetoService projetoService = new ProjetoService();

			if (operacao.equals("salvar")) {
				String nome = req.getParameter("nome");
				String status = req.getParameter("status");
				String inicio = req.getParameter("inicio");

				projetoService.salvar(nome, status, inicio);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			req.getRequestDispatcher("/temp/cadastrarAcao.jsp").forward(req,
					resp);
		}

	}

}
