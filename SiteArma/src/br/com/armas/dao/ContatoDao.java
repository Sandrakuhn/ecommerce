package br.com.armas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.armas.entity.Contato;




public class ContatoDao {
	
	private static List<Contato> contatos = new ArrayList<Contato>();
	
	 public static void gravarContato(Contato v) {

         Contato p = new Contato();
         p = v;
         EntityManagerFactory emf = Persistence
                         .createEntityManagerFactory("Armamentos");

         EntityManager em = emf.createEntityManager();

         EntityTransaction tx = em.getTransaction();

         tx.begin();
         em.persist(p);
         tx.commit();

         Query q = em.createQuery("SELECT p FROM Contato p");
         List<Contato> contatos = q.getResultList();

         em.close();
         emf.close();
	 }
	 
	 
	 public static List<Contato> listarContatos() {
         
         EntityManagerFactory emf = Persistence
                         .createEntityManagerFactory("Armamentos");

         EntityManager em = emf.createEntityManager();

         EntityTransaction tx = em.getTransaction();

         
         Query q = em.createQuery("SELECT p FROM Contato p");
         
         List<Contato> contatos = q.getResultList();
         return contatos;
 }

}
