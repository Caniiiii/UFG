package br.com.acoesprojetos.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.acoesprojetos.model.Investimento;
import br.com.acoesprojetos.util.HibernateUtil;

public class InvestimentoDAO {

	public void salvar(Investimento investimento) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = session.beginTransaction();
			session.save(investimento);
			transacao.commit();
		} catch (RuntimeException ex) {
			if (transacao != null)
				transacao.rollback();
			throw ex;
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Investimento> listar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Investimento> investimentos = null;

		try {
			Query consulta = session.getNamedQuery("Investimento.listar");
			investimentos = consulta.list();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			session.close();
		}

		return investimentos;
	}

	public Investimento buscarPorCodigo(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Investimento investimento = null;

		try {
			Query consulta = session
					.getNamedQuery("Investimento.buscarPorCodigo");
			consulta.setLong("id", id);

			investimento = (Investimento) consulta.uniqueResult();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			session.close();
		}
		return investimento;
	}

	public void excluir(Investimento investimento) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = session.beginTransaction();
			session.delete(investimento);
			transacao.commit();
		} catch (RuntimeException ex) {
			if (transacao != null)
				transacao.rollback();
			throw ex;
		} finally {
			session.close();
		}
	}

	public void editar(Investimento investimento) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;

		try {
			transacao = session.beginTransaction();
			session.update(investimento);
			transacao.commit();
		} catch (RuntimeException ex) {
			if (transacao != null)
				transacao.rollback();
			throw ex;
		} finally {
			session.close();
		}
	}
}
