package br.com.armas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import br.com.armas.entity.Metralhadora;

public class MetralhadoraDao {
	private static List<Metralhadora> metralhadoras = new ArrayList<Metralhadora>();

    public static void gravarMetralhadora(Metralhadora v) {

    	Metralhadora p = new Metralhadora();
            p = v;
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armas");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

            tx.begin();
            em.persist(p);
            tx.commit();

            Query q = em.createQuery("SELECT p FROM Metralhadora p");
            List<Metralhadora> Metralhadoras = q.getResultList();

            em.close();
            emf.close();
    }

    public static List<Metralhadora> listarMetralhadoras() {
            
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armas");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

            
            Query q = em.createQuery("SELECT p FROM Metralhadora p");
            
            List<Metralhadora> Metralhadoras = q.getResultList();
            return Metralhadoras;
    }


}
