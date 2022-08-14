package exercicio_1;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LivroDAO {
	public EntityManager conectaBanco() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DiogoPU");
		return factory.createEntityManager();
	}
	
	public Livro salvaLivro(Livro l) {
		EntityManager em = this.conectaBanco();
		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("ERRO AO SALVAR LIVRO " + e);
			em.getTransaction().rollback();
		}finally{
			em.close();
		}
		return l;		
	}
	public Livro consultarId(int id){
		EntityManager em = this.conectaBanco();
		Livro livro = new Livro();
		try {
			livro = em.find(Livro.class, id);					
		}catch(Exception e){
			System.out.println("Não foi possivel consultar pelo ID do livro" + e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}	
		return livro;
	}
	
	public void excluirLivro(int id) {
		EntityManager em = this.conectaBanco();
		try {
			em.getTransaction().begin();
			Livro l = em.find(Livro.class, id);
			System.out.println("LIVRO: " + l.getTitulo());			
			em. remove(l);				
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("Não foi possivel excluir o livro" + e);
			em.getTransaction().rollback();
		}finally{
			em.close();
		}
	}
}
