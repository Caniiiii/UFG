package br.com.acoesprojetos.service;

import java.util.List;

import br.com.acoesprojetos.dao.InvestimentoDAO;
import br.com.acoesprojetos.model.Acao;
import br.com.acoesprojetos.model.Investimento;

// TODO: Auto-generated Javadoc
/**
 * The Class InvestimentoService.
 */
public class InvestimentoService {

	/** The dao. */
	InvestimentoDAO dao;

	/**
	 * Instantiates a new investimento service.
	 */
	public InvestimentoService() {
		dao = new InvestimentoDAO();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Salvar.
	 *
	 * @param investimento
	 *            the investimento
	 */
	public void salvar(Investimento inv) throws Exception {
		dao.inserir(inv);
	}

	/**
	 * Editar.
	 *
	 * @param inv
	 *            the inv
	 */
	public void editar(Investimento inv) {
		dao.atualizar(inv);
	}

	/**
	 * Listar.
	 *
	 * @param acao
	 *            the acao
	 * @return the list
	 */
	public List<Investimento> listar() {
		return dao.getLista();
	}

	/**
	 * Excluir.
	 *
	 * @param id
	 *            the id
	 */
	public void excluir(int id) {
		dao.delete(new Investimento(), id);
	}

	/**
	 * Busca id.
	 *
	 * @param id
	 *            the id
	 * @return the investimento
	 */
	public Investimento buscaId(int id) {
		return dao.findById(id);
	}
	
	/**
	 * Busca lista por acao.
	 *
	 * @param acao the acao
	 * @return the list
	 */
	public List<Investimento> buscaListaPorAcao(Acao acao) {
		return dao.buscaListaPorAcao(acao);
	}
}
