package br.com.armas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.armas.entity.Revolver;

public class RevolverDao {
	private static List<Revolver> Revolvers = new ArrayList<Revolver>();

	public static void gravarRevolver(Revolver v) {

		Revolver p = new Revolver();
		p = v;
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Armas");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(p);
		tx.commit();

		Query q = em.createQuery("SELECT p FROM Revolver p");
		List<Revolver> Revolvers = q.getResultList();

		em.close();
		emf.close();
	}

	public static List<Revolver> listarRevolvers() {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Armas");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		Query q = em.createQuery("SELECT p FROM Revolver p");

		List<Revolver> Revolvers = q.getResultList();
		return Revolvers;
	}

}
