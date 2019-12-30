package com.java.H2IntegrationWithSpringBoot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Example {
	
	@Autowired
	@Qualifier("blue")
	public Color color;

	void display()
	{
		color.colorImplementattion();
	}
	
	
	
	
	

}
