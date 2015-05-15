package br.com.acoesprojetos.test;

import org.junit.Ignore;
import org.junit.Test;

import br.com.acoesprojetos.dao.AcaoDAO;
import br.com.acoesprojetos.dao.UsuarioDAO;
import br.com.acoesprojetos.model.Acao;
import br.com.acoesprojetos.model.Usuario;

public class AcaoDAOTest {
	
	@Ignore
	@Test
	public void salvar(){
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscarPorCodigo(4L);
		
		Acao acao = new Acao();
		acao.setUsuario(usuario);
		acao.setNome("Petrobras");
		
		AcaoDAO acaoDAO = new AcaoDAO();
		acaoDAO.salvar(acao);
	}
	
	@Ignore
	@Test
	public void listar(){
		AcaoDAO dao = new AcaoDAO();
		System.out.println(dao.listar());
	}
	
	@Ignore
	@Test
	public void buscarPorCodigo(){
		AcaoDAO dao = new AcaoDAO();
		System.out.println(dao.buscarPorCodigo(1L));
	}
	
	@Ignore
	@Test
	public void excluir(){
		AcaoDAO dao = new AcaoDAO();
		Acao acao = dao.buscarPorCodigo(1L);
		dao.excluir(acao);
	}
	
	@Ignore
	@Test
	public void editar(){
		AcaoDAO acaoDAO = new AcaoDAO();
		Acao acao = acaoDAO.buscarPorCodigo(1L);
		
		acao.setNome("IBM");
		acaoDAO.editar(acao);
	}
}
