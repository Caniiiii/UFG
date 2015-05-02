package br.com.acoesprojetos.model;

import java.util.Date;

public class Projeto {

	private long id;
	private Usuario usuario;
	private String nome;
	private String descricao;
	private Date dataInicio;
	private Date fataFim;
	private int duracao;
	private int status;
	private double despessas;
	private double ganho;
	private double lucro;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getFataFim() {
		return fataFim;
	}
	public void setFataFim(Date fataFim) {
		this.fataFim = fataFim;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getDespessas() {
		return despessas;
	}
	public void setDespessas(double despessas) {
		this.despessas = despessas;
	}
	public double getGanho() {
		return ganho;
	}
	public void setGanho(double ganho) {
		this.ganho = ganho;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	
	
}
