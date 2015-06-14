package br.com.acoesprojetos.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acoesprojetos.model.Acao;
import br.com.acoesprojetos.service.AcaoService;

@WebServlet(name = "AcaoServlet", urlPatterns = "/temp/acao")
public class AcaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		AcaoService acaoService = new AcaoService();
		String opcao = req.getParameter("opcao");
		
		System.out.println("Opcao: " + opcao);
		try {
			
			if (opcao == null || opcao.equals("")){
				
			} else if (opcao.equals("inserir")) {
				String nome = req.getParameter("nome");
				String quantidade = req.getParameter("quantidade");
				String valor = req.getParameter("valor");

				acaoService.salvar(nome, quantidade, valor);
			} else if (opcao.equals("listar")) {
				List<Acao> acoes = new ArrayList<Acao>(); 
				acoes = acaoService.listar();
				req.setAttribute("acoes", acoes);
			} else if (opcao.equals("carregarEditar")) {
				
			}
				
				
			req.getRequestDispatcher("/temp/acoes.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
