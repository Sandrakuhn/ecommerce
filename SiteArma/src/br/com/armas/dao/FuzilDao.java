package br.com.armas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.armas.entity.Fuzil;


public class FuzilDao {
	
	private static List<Fuzil> fuzis = new ArrayList<Fuzil>();

    public static void gravarFuzil(Fuzil v) {

            Fuzil p = new Fuzil();
            p = v;
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armas");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

            tx.begin();
            em.persist(p);
            tx.commit();

            Query q = em.createQuery("SELECT p FROM Fuzil p");
            List<Fuzil> fuzis = q.getResultList();

            em.close();
            emf.close();
    }

    public static List<Fuzil> listarFuzis() {
            
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armas");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

            
            Query q = em.createQuery("SELECT p FROM Fuzil p");
            
            List<Fuzil> fuzis = q.getResultList();
            return fuzis;
    }


}
