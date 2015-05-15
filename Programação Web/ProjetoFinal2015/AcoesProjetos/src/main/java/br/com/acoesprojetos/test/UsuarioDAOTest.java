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
		user1.setNome("Felipe Campos");
		user1.setEmail("tecnologiagrave@gmail.com");
		user1.setLogin("felipelogin");
		user1.setDataNasc(new Date());
		user1.setSenha("123456789");

		UsuarioDAO dao = new UsuarioDAO();

		dao.salvar(user1);
	}

	@Ignore
	@Test
	public void listar() {
		UsuarioDAO dao = new UsuarioDAO();
		System.out.println(dao.listar());
	}
	
	@Ignore
	@Test
	public void buscarPorCodigo() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		System.out.println(usuarioDAO.buscarPorCodigo(1L));
	}
	
	@Ignore
	@Test
	public void excluir() {
		 UsuarioDAO dao = new UsuarioDAO();
		 Usuario usuario = dao.buscarPorCodigo(1L);
		 dao.excluir(usuario);
	}
	
	@Ignore
	@Test
	public void editar() {
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = dao.buscarPorCodigo(2L);
		
		usuario.setNome("gatorate");
		usuario.setEmail("@@@@@");
		usuario.setSenha("teste");
		usuario.setDataNasc(new Date());
		
		dao.editar(usuario);
	}
}
