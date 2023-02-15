package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;


public class Studentdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("xyz");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

	public void Insert(Student student){
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
}
