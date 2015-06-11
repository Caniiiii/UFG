package br.com.acoesprojetos.service;

import br.com.acoesprojetos.dao.UsuarioDAO;
import br.com.acoesprojetos.model.Usuario;

public class UsuarioService {
	
	public void salvar(String nome, String login, String senha, String email){
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setEmail(email);
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.inserir(usuario);
	}
	
	public void editar(){
		
	}
	
	public void listar(){
		
	}
	
	public void excluir(){
		
	}
}
