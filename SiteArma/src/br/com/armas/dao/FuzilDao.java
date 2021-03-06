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
    		
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armamentos");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

            tx.begin();
            em.persist(v);
            tx.commit();
            
            em.close();
            emf.close();
    }

    public static List<Fuzil> listarFuzis() {
          if(fuzis == null){ 
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armamentos");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

           
            Query q = em.createQuery("SELECT p FROM Fuzil p");
            List<Fuzil> fuzis = q.getResultList();
            
          fuzis = q.getResultList();
          em.close();
          }
            return fuzis;
    }
    
    public static void removerFuzil(Fuzil v){
    	
           EntityManagerFactory emf = Persistence
                           .createEntityManagerFactory("Armamentos");

           EntityManager em = emf.createEntityManager();

           EntityTransaction tx = em.getTransaction();
           
           v = em.getReference(Fuzil.class, 1);

           tx.begin();
           em.remove(v);
           tx.commit();
           
           em.close();
           emf.close();
    }
    



}
