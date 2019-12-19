package com.krishna.jpaOneToMany_Mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kk");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Library l = new Library();
		l.setBook_name("corejava");
		
		Library l1 = new Library();
		l1.setBook_name("adv.java");
		
		Library l2 = new Library();
		l2.setBook_name("hibernate");
		
		Library l3 = new Library();
		l3.setBook_name("spring");
		
		Library l4 = new Library();
		l4.setBook_name("springBoot");
		
		Library l5 = new Library();
		l5.setBook_name("springDataJpa");
		
		em.persist(l);
		em.persist(l1);
		em.persist(l2);
		em.persist(l3);
		
		ArrayList<Library> al = new ArrayList<Library>();
		al.add(l);
		al.add(l1);
		al.add(l2);
		al.add(l3);

		Student s = new Student();
		s.setName("krishna");
		s.setBooks(al);
			
		em.persist(s);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
