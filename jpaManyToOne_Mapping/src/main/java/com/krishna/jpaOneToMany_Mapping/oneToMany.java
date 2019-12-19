package com.krishna.jpaOneToMany_Mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class oneToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kk");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Library l = new Library();
		l.setBook_name("microservices");
		
		em.persist(l);
		
		Student s = new Student();
		s.setName("krishna");
		s.setLib(l);
		
		Student s1 = new Student();
		s1.setName("nikhil");
		s1.setLib(l);
		
		Student s2 = new Student();
		s2.setName("rajesh");
		s2.setLib(l);
		
		em.persist(s);
		em.persist(s1);
		em.persist(s2);
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
	}

}
