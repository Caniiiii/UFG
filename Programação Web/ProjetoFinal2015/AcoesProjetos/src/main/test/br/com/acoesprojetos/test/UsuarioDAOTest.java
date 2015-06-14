package br.com.acoesprojetos.test;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

import br.com.acoesprojetos.dao.UsuarioDAO;
import br.com.acoesprojetos.model.Usuario;

public class UsuarioDAOTest {
	
	@Test
	public void salvar() {
		Usuario user1 = new Usuario();
		user1.setNome("Michel Ferreira2");
		user1.setEmail("michel@gmail.com");
		user1.setLogin("michellogin");
		user1.setDataNasc(new Date());
		user1.setSenha("123456789");

		UsuarioDAO dao = new UsuarioDAO();

		dao.inserir(user1);
		System.out.println("salvou");
	}

	@Ignore
	@Test
	public void listar() {
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.getLista());
	}
	
	@Ignore
	@Test
	public void buscarPorCodigo() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario user1= usuarioDAO.findById(2);
		System.out.println(user1.getNome());
	}
	
	@Ignore
	@Test
	/**
	 * Passa como parametro um objeto do tipo que for excluido e seu id
	 * para identifica��o para a exclus�o
	 * � retornado o objeto excluido populado
	 */
	public void excluir() {
		 UsuarioDAO dao = new UsuarioDAO();
		 System.out.println(dao.delete(new Usuario(), 1).getNome());
	}
	
	@Ignore
	@Test
	public void editar() {
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = dao.findById(2);
		
		usuario.setNome("Michel");
		usuario.setEmail("@@@@@");
		usuario.setSenha("teste");
		usuario.setDataNasc(new Date());
		
		dao.atualizar(usuario);
	}
}
