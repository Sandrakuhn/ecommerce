package br.com.armas.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import br.com.armas.entity.Bazooka;



public class BazookaDao {
	
	
	private static List<Bazooka> bazookas = new ArrayList<Bazooka>();

	public static void gravarBazooka(Bazooka b) {

		Bazooka bazooka = new Bazooka();
		bazooka = b;
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Armas");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(bazooka);
		tx.commit();

		em.close();
		emf.close();
	}
	
	
public static List<Bazooka> listarBazooka() {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Bazooka");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		
		Query q = em.createQuery("SELECT p FROM Veiculo p");
		
		List<Bazooka> bazooka = q.getResultList();
		em.close();
		emf.close();
		return bazookas;
	}

}
