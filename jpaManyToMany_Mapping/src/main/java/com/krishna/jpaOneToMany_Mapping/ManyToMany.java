package com.krishna.jpaOneToMany_Mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kk");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student s = new Student();
		s.setName("krishna");
		
		Student s1 = new Student();
		s1.setName("nikhil");
		
		em.persist(s);
		em.persist(s1);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s);
		al1.add(s1);
		
		Library li = new Library();
		li.setBook_name("DBMS");
		li.setSt(al);
		
		Library li1 = new Library();
		li1.setBook_name("MongoDB");
		li1.setSt(al1);
		
		em.persist(li);
		em.persist(li1);
		
		em.getTransaction().commit();
		
	}

}
