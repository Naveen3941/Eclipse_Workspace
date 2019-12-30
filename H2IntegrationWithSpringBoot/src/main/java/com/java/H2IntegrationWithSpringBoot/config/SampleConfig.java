package com.java.H2IntegrationWithSpringBoot.config;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.java.H2IntegrationWithSpringBoot.component.ComponentClass;
import com.java.H2IntegrationWithSpringBoot.model.Employee;
import com.java.H2IntegrationWithSpringBoot.service.EmployeeService;

@Configuration
public class SampleConfig {

	public SampleConfig() {
		System.out.println("configuration constructor...");
	}

	@PostConstruct
	private void paussr() {
		System.out.println("Post Constructor in configuration.................");
	}

	@Bean(name = "defaultFile")
	public File defaultFile() {
		File defaultFile = new File("student.properties");
		return defaultFile;
	}

	@Bean(name = "namedFile")
	public File namedFile() {
		File namedFile = new File("student.properties");
		return namedFile;
	}

	@Bean(name = "pullString")
	public String perform() {
		String a = "nav";
		String b = a + "een";
		return b;
	}
	@Bean
	public ComponentClass getObject1()
	{
		
		ComponentClass c1=new ComponentClass();
		//c1.setMsg("naaa");
		return c1;
	}

}