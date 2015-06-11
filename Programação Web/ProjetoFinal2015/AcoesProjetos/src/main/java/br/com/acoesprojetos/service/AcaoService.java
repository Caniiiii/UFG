package br.com.acoesprojetos.service;

import br.com.acoesprojetos.dao.AcaoDAO;
import br.com.acoesprojetos.dao.UsuarioDAO;
import br.com.acoesprojetos.model.Acao;

public class AcaoService {

	public void salvar(String nome, String quantidade, String valor) throws Exception{
		Acao acao = new Acao();
		acao.setNome(nome);
		acao.setQuantidade(Integer.parseInt(quantidade));
		acao.setPreco(Double.parseDouble(valor));

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		acao.setUsuario(usuarioDAO.findById(1));

		AcaoDAO acaoDAO = new AcaoDAO();
		acaoDAO.inserir(acao);
	}

	public void editar() {

	}

	public void listar() {

	}

	public void excluir() {

	}
}
