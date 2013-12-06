package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Produto;

public class TestaInsereProduto {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojavirtualDB");
		EntityManager em = factory.createEntityManager();
		
		Produto p = new Produto();
		p.setNome("camisa 3");
		p.setPreco(275.00);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
}
