package com.java.H2IntegrationWithSpringBoot.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Red implements Color{

	@Override
	public void colorImplementattion() {

   System.out.println("this is a red color: ");
		
	}

	
}
