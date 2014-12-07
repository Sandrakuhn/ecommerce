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
                            .createEntityManagerFactory("Armamentos");

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
            List<Fuzil> listarfuzil = new ArrayList<Fuzil>();
            EntityManagerFactory emf = Persistence
                            .createEntityManagerFactory("Armamentos");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

           
            Query q = em.createQuery("DELETE p FROM Fuzil WHERE ID = 1");
            
            listarfuzil = q.getResultList();
            return listarfuzil;
    }
    
    public static void removerFuzil(Fuzil v){
    	   Fuzil p = new Fuzil();
           p = v;
           EntityManagerFactory emf = Persistence
                           .createEntityManagerFactory("Armamentos");

           EntityManager em = emf.createEntityManager();

           EntityTransaction tx = em.getTransaction();

           tx.begin();
           em.remove(p);
           tx.commit();
    }
    
    public void gravarAK47(){
		Fuzil ak47 = new Fuzil();
		
		System.out.println("GRAVARAK47!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		ak47.setCano("longo");
		ak47.setFabricante("kalashnikov");
		ak47.setModelo("AK-47");
		ak47.setTipo("Automática");
		FuzilDao.gravarFuzil(ak47);
		
	}


}
