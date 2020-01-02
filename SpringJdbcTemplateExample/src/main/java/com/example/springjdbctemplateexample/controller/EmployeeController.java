package com.example.springjdbctemplateexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjdbctemplateexample.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PostMapping("/saveAll")
	public String saveAll()
	{
		String sql="insert into emp123 values(?,?,?)";
		
		int count=jdbcTemplate.update(sql, 1,"Naveen",26);
		System.out.println("Succesfully saved "+count);
	return "Succesfully";	
	}
	

}
