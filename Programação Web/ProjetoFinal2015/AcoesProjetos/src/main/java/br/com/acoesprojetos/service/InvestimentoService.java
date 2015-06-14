package br.com.acoesprojetos.service;

import java.util.List;

import br.com.acoesprojetos.dao.InvestimentoDAO;
import br.com.acoesprojetos.dao.UsuarioDAO;
import br.com.acoesprojetos.model.Acao;
import br.com.acoesprojetos.model.Investimento;
import br.com.acoesprojetos.model.Usuario;

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
	 * @param nome the nome
	 * @param login the login
	 * @param senha the senha
	 * @param email the email
	 */
	public void salvar(String nome, String login, String senha, String email){
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setEmail(email);
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.inserir(usuario);
	}
	
	/**
	 * Editar.
	 *
	 * @param inv the inv
	 */
	public void editar(Investimento inv) {
		dao.atualizar(inv);
	}

	/**
	 * Listar.
	 *
	 * @param acao the acao
	 * @return the list
	 */
	public List<Investimento> listar(Acao acao) {
		return dao.buscaListaPorAcao(acao);
	}

	/**
	 * Excluir.
	 *
	 * @param id the id
	 */
	public void excluir(int id) {
		dao.delete(new Investimento(), id);
	}
	
	/**
	 * Busca id.
	 *
	 * @param id the id
	 * @return the investimento
	 */
	public Investimento buscaId(int id) {
		return dao.findById(id);
	}
}
