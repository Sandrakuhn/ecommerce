package br.com.armas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import br.com.armas.entity.Pistola;



public class PistolaDao {
	
	private static List<Pistola> pistolas = new ArrayList<Pistola>();

    public static void gravarPistola (Pistola v) {

    		Pistola p = new Pistola();
            p = v;
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armamentos");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

            tx.begin();
            em.persist(p);
            tx.commit();

            Query q = em.createQuery("SELECT p FROM Pistola p");
            List<Pistola> pistolas = q.getResultList();

            em.close();
            emf.close();
    }

    public static List<Pistola> listarPistolas() {
            
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("Armamentos");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();


        Query q = em.createQuery("SELECT p FROM Pistola p");

        List<Pistola> pistolas = q.getResultList();
        em.close();
        emf.close();
        return pistolas;
    }


}
