package com.java.H2IntegrationWithSpringBoot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.java.H2IntegrationWithSpringBoot.model.Employee;
import com.java.H2IntegrationWithSpringBoot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	public EmployeeService() {
     System.out.println("Employee Service....");
    }

	@Resource(name = "pullString")
	private String pString;

	void Service() {
		System.out.println("$$$$$$$$$$$$$$$$$$ -" + pString);

	}

	@Autowired
	EmployeeRepository repository;

	@PostConstruct
    private void paussd() {
		System.out.println("Post Constructor in service.................");
	}

	public void saved(Employee emp) {
		repository.save(emp);
	}
	public void allSaved(List<Employee> emp) {
		repository.saveAll(emp);
		
	}


	public List<Employee> getAllRecords() {

		List<Employee> emp = (List<Employee>) repository.findAll();

		return emp;

	}

	public void delete(int a) {

		repository.deleteById(a);

	}

	/*public Employee find(String name1) {

		Employee emp2 = repository.findByName(name1).get(0);
		return emp2;
	}*/

	/*public Employee findIdandName(String name1, int age1) {

		Employee e2 = repository.findIdandName(name1, age1).get(0);
		return e2;
	}
*/
	public boolean existId(int id) {
		boolean b=repository.existsById(id);
		return b;
	}

	
	

}
