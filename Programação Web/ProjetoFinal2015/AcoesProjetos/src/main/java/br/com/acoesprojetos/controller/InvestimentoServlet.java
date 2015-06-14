package br.com.acoesprojetos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acoesprojetos.model.Acao;
import br.com.acoesprojetos.service.AcaoService;
import br.com.acoesprojetos.service.InvestimentoService;

@WebServlet(name = "InvestimentoServlet", urlPatterns = "/temp/investimento")
public class InvestimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String opcao = req.getParameter("opcao");
		System.out.println("Opcao Investimento Servlet: " + opcao);
		
		InvestimentoService invService = new InvestimentoService();
		AcaoService acaoService = new AcaoService();
		
		try {
			if ( opcao == null || opcao.equals("")){
				
			} else if (opcao.equals("inserir")) {
				req.getRequestDispatcher("/temp/cadastrarInvestimento.jsp").forward(req, resp);
				
			} else if (opcao.equals("alterar")) {
			} else if (opcao.equals("excluir")) {
			} else if (opcao.equals("listar")) {
				int codAcao = Integer.parseInt(req.getParameter("codAcao"));
				Acao acao = acaoService.buscaId(codAcao);
				
				req.setAttribute("investimentos", invService.listar(acao));
				req.setAttribute("acao", acao);
				req.getRequestDispatcher("/temp/cadastrarAcao.jsp").forward(req, resp);
			}  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
