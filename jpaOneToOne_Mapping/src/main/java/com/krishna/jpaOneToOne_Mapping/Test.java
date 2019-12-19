package com.krishna.jpaOneToOne_Mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kk");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s = new Student();
		s.setName("kk");
		
		em.persist(s);
		
		Library l = new Library();
		l.setName("krishnaLibrary");
		l.setStudent(s);

		em.persist(l);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
