package br.com.acoesprojetos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acoesprojetos.service.AcaoService;

@WebServlet(name = "AcaoServlet", urlPatterns = "/temp/cadastroAcao")
public class InvestimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		try {
			String operacao = req.getParameter("cadastro");
			AcaoService acaoService = new AcaoService();

			if (operacao.equals("salvar")) {
				String nome = req.getParameter("nome");
				String quantidade = req.getParameter("quantidade");
				String valor = req.getParameter("valor");

				acaoService.salvar(nome, quantidade, valor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			req.getRequestDispatcher("/temp/cadastrarAcao.jsp").forward(req,
					resp);
		}

	}

}
