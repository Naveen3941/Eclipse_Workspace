package com.java.H2IntegrationWithSpringBoot;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.java.H2IntegrationWithSpringBoot.component.ComponentClass;
import com.java.H2IntegrationWithSpringBoot.repository.Example;

@SpringBootApplication
public class H2IntegrationWithSpringBootApplication {
	

	public H2IntegrationWithSpringBootApplication() {
		System.out.println("constructor in main class");
	}


	@PostConstruct
	private void init() {
		System.out.println("Post Constructor in main class as SpringBootApplication....");
	}


	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(H2IntegrationWithSpringBootApplication.class, args);
	  ComponentClass c1=context.getBean("getObject1",ComponentClass.class);
	  System.out.println(".............."+c1.getMsg());
	  
		
	}

}
