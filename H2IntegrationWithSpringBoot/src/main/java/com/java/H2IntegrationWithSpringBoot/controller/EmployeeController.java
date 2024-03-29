package com.java.H2IntegrationWithSpringBoot.controller;

import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.java.H2IntegrationWithSpringBoot.config.SampleConfig;
import com.java.H2IntegrationWithSpringBoot.model.Employee;
import com.java.H2IntegrationWithSpringBoot.repository.Color;
import com.java.H2IntegrationWithSpringBoot.service.EmployeeService;

@RestController
public class EmployeeController {
	public EmployeeController() {
		System.out.println("Employee Controller....");
	}

	@PostConstruct
	private void pauss() {
		System.out.println("Post Constructor in controller.................");
	}

	@Autowired
	EmployeeService service;

	@Autowired
	@Qualifier("blue")
	Color color;

	@PostMapping("/saveAll")
	public String allSaved(@RequestBody List<Employee> emp) {
		service.allSaved(emp);
		color.colorImplementattion();
		return "inserted succesfully...";
	}

	@PostMapping("/save")
	public String saved(@RequestBody Employee emp) {
		service.saved(emp);
		return "inserted succesfully...";
	}

	@GetMapping("/getAll")
	public List<Employee> getAllRecords() {
		return service.getAllRecords();
	}

	@GetMapping("/exist/e_id")
	public boolean existId(@PathVariable("e_id") int id) {
		boolean b = service.existId(id);
		return true;
	}

	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable("id") int a) {
		service.delete(a);
		return "deleted succesfully...";
	}

	/*
	 * @GetMapping("/find/{name}") public Employee find(@PathVariable("name") String
	 * name1) {
	 * 
	 * System.out.println("entered....");
	 * 
	 * Employee e1 = service.find(name1);
	 * 
	 * return e1;
	 * 
	 * }
	 */
	/*
	 * @GetMapping(value = "/findBy/{name}/{age}", produces =
	 * MediaType.APPLICATION_XML_VALUE)
	 * 
	 * public Employee findBy(@PathVariable("name") String
	 * name1, @PathVariable("age") int age1) {
	 * 
	 * System.out.println("entered....");
	 * 
	 * Employee e1 = service.findIdandName(name1, age1);
	 * 
	 * return e1; }
	 */

	@RequestMapping("/reqmap/{userId}")
	public String m11(@PathVariable("userId") String user,
			@RequestParam(value = "Name", required = false) String name) {
		System.out.println("path variable in controller class.." + user + "....." + name);

		return "it is a m1 method..." + user + "...." + name;

	}

	@GetMapping("/sort")
	public List<String> sort() {
		System.out.println("entered");
		List<Employee> e1 = service.getAllRecords();
		List<String> s = e1.stream().map(p -> p.getName()).sorted().collect(Collectors.toList());
		System.out.println(s);
		return s;

	}

}
