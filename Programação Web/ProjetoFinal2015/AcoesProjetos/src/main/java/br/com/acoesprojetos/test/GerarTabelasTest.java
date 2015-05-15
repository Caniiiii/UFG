package br.com.acoesprojetos.test;

import org.junit.Test;

import br.com.acoesprojetos.util.HibernateUtil;

public class GerarTabelasTest {
	
	@Test
	public void gerar(){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
}
