package br.com.acoesprojetos.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.acoesprojetos.dao.ProjetoDAO;
import br.com.acoesprojetos.model.Projeto;

public class ProjetoService {

	public void salvar(String nome, String inicioS, String status)
			throws ParseException {
		Date inicio;
		try {
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			inicio = (java.util.Date) formatter.parse(inicioS);
		} catch (ParseException e) {
			throw e;
		}

		Projeto projeto = new Projeto();
		projeto.setNome(nome);
		projeto.setDataInicio(inicio);
		projeto.setStatus(Integer.parseInt(status));

		ProjetoDAO projetoDAO = new ProjetoDAO();
		projetoDAO.inserir(projeto);
	}

	public void editar() {

	}

	public void listar() {

	}

	public void excluir() {

	}
}
