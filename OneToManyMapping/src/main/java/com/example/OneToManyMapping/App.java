package com.example.OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("naveen");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	
    	 
    	Student s1=new Student();
    	Student s2=new Student();
    	
    	s1.setS_name("RamaKrishna");
    	s1.setPhonenumber("9876543210");
    	//s1.setLib(c1);
    	
    	s2.setS_name("Krishna");
    	s2.setPhonenumber("9875555210");
    	//s2.setLib(c1);
    	
    	em.persist(s1);
    	em.persist(s2);
    	

    	Course c1=new Course();
    	c1.setC_name("Java");
    	c1.setC_teach("Navin Reddy");
    	List<Student> lib=new ArrayList<Student>();
    	lib.add(s1);
    	lib.add(s2);
    	c1.setNaveen(lib);
    	
    	
    	 em.persist(c1);
    	
    	
    	
       
         
        em.getTransaction().commit();
        em.close();
        emf.close();
    	
        System.out.println( "Hello World!" );
    }
}
