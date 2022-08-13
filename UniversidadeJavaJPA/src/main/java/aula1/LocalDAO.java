package aula1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LocalDAO {
	public EntityManager getEM() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DiogoPU");
		return factory.createEntityManager();
	}

	public Local salvar(Local local) {
		EntityManager em = this.getEM();
		try {
			em.getTransaction().begin();
			em.persist(local);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

		return local;

	}

}
