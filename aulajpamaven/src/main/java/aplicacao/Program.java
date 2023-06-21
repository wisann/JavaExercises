package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//inserir
		Pessoa pessoa = new Pessoa(null, "wisan", "wisan@gmail.com");
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		
		//consulta
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		//deletar
		Pessoa p2 = em.find(Pessoa.class, 3);
		em.getTransaction().begin();
		em.remove(p2);
		em.getTransaction().commit();

		System.out.println("Pronto");
		em.close();




	}

}
