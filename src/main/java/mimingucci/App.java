package mimingucci;

import jakarta.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		EntityManager entityManager=JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Student student=new Student("Messi", "Leo", "leomessi@gmail.com");
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		JpaUtil.shutdown();
	}
}
