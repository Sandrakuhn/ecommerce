package br.com.armas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.armas.dao.ContatoDao;
import br.com.armas.entity.Contato;


@ManagedBean
public class MContatoBean {
	
	private List<Contato> contatos = new ArrayList<Contato>();
	private Contato contato = new Contato();
	
	
	
	
	
	public void excluir(Contato contato){
	
		EntityManagerFactory emf = Persistence
                  .createEntityManagerFactory("Armamentos");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
	
		tx.begin();
		contato = em.merge(contato);
		em.remove(contato);
		tx.commit();
		em.close();
		
	}
	
	public void gravarContato(Contato v){
		ContatoDao.gravarContato(v);
	}




	public List<Contato> getContatos() {
		return ContatoDao.listarContatos();
	}




	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}




	public Contato getContato() {
		return contato;
	}




	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	

	
	
}
