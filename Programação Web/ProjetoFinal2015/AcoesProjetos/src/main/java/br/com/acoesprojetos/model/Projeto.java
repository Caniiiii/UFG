package br.com.acoesprojetos.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_projeto")
@NamedQueries({
		@NamedQuery(name = "Projeto.listar", query = "SELECT projeto FROM Projeto projeto"),
		@NamedQuery(name = "Projeto.buscarPorCodigo", query = "SELECT projeto FROM Projeto projeto WHERE projeto.id = :id") })
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prj_id")
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prj_usr_id", referencedColumnName = "usr_id")
	private Usuario usuario;

	@Column(name = "prj_nome", length = 60, nullable = false)
	private String nome;

	@Column(name = "prj_descricao")
	private String descricao;

	@Column(name = "prj_datainicio", nullable = false)
	@Temporal(value = TemporalType.DATE)
	private Date dataInicio;

	@Column(name = "prj_datafim")
	@Temporal(value = TemporalType.DATE)
	private Date dataFim;

	@Column(name = "prj_duracao")
	private int duracao;

	@Column(name = "prj_status", length = 20, nullable = false)
	private int status;

	@Column(name = "prj_despesa", precision = 15, scale = 2)
	private double despesas;

	@Column(name = "prj_ganho", precision = 15, scale = 2)
	private double ganho;

	@Column(name = "prj_lucro", precision = 15, scale = 2)
	private double lucro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
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

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(double despesas) {
		this.despesas = despesas;
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

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", usuario=" + usuario + ", nome=" + nome
				+ ", descricao=" + descricao + ", dataInicio=" + dataInicio
				+ ", dataFim=" + dataFim + ", duracao=" + duracao + ", status="
				+ status + ", despesas=" + despesas + ", ganho=" + ganho
				+ ", lucro=" + lucro + "]";
	}

}
