package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class JpashopApplication {
	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction trx = em.getTransaction();
//		trx.begin();
//		trx.commit();
		SpringApplication.run(JpashopApplication.class, args);
	}

}
