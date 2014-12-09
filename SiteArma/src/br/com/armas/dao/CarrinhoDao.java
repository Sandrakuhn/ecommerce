package br.com.armas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.armas.entity.Carrinho;
import br.com.armas.entity.Fuzil;

public class CarrinhoDao {

	private static List<Carrinho> carrinhos = new ArrayList<Carrinho>();

	public static void AdicionarProdudutoAoCarrinho(Carrinho v) {

		Carrinho p = new Carrinho();
		p = v;

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Armamentos");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.persist(p);
		tx.commit();

		Query q = em.createQuery("SELECT p FROM Carrinho p");
		List<Carrinho> carrinhos = q.getResultList();

		em.close();
		emf.close();
	}

	public static List<Carrinho> ListarProdutosDoCarrinho() {

		  
        EntityManagerFactory emf = Persistence
                        .createEntityManagerFactory("Armamentos");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        
        Query q = em.createQuery("SELECT p FROM Carrinho p");
        
        List<Carrinho> carrinhos = q.getResultList();
        return carrinhos;
	}

	public static void excluir(Carrinho c) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Armamentos");

		EntityManager em = emf.createEntityManager();
		
		Carrinho carrinho = em.getReference(Carrinho.class, c.getId());

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(carrinho);
		tx.commit();
		
		em.close();
		emf.close();

	}
	
	public static void EsvaziarCarrinho(){
		
	
	}

}
