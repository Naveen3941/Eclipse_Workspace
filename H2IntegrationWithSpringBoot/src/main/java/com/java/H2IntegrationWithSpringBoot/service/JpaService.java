package com.java.H2IntegrationWithSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.java.H2IntegrationWithSpringBoot.model.Employee;
import com.java.H2IntegrationWithSpringBoot.repository.EmployeeRepository;

@Service
public class JpaService {
    @Autowired
	EmployeeRepository repository;
    
	public void savedAll(List<Employee> emp) {
		repository.saveAll(emp);
		
	}

	public List<Employee> findSort(Sort sort) {
		
		List<Employee> e2=repository.findAll(Sort.by("name").descending().and(Sort.by("age")));
		//productRepository.findAll(Sort.by("name"))
		return e2;
	}

	public Page<Employee> findPage(Pageable page) {
		Page<Employee> p1=repository.findAll(page);
		Pageable p2=PageRequest.of(0, 5);
		return p1;
	}

	public void flushing(Employee emp) {
		repository.flush();
		
		
	}

	public void deleteBatch() {
		//repository.deleteInBatch(entities);;
		
	}

	public void flushAndSave(Employee emp) {
		repository.saveAndFlush(emp);
		
	}

	public List<Employee> findByName(String name) {
		List<Employee> e2= repository.findByName(name);
		return e2;
	}

	public Employee findByIdAndName(int id,String name) {
		Employee e2=repository.findByIdAndName(id, name);
		return e2;
	}
	public List<Employee> findByIdOrName(int id,String name) {
		System.out.println("service entered..");
		List<Employee> e2=(List<Employee>) repository.findByIdOrName(id, name);
		return e2;
	}

	public Iterable<Employee> findAll() {
		
		return repository.findAll();
	}

	public Iterable<Employee> findAllById(Iterable<Integer> ids) {
		
		return repository.findAllById(ids);
	}

	public List<Employee> findByNameContaining(String name) {
		
		return repository.findByNameContaining(name);
	}

	public List<Employee> likeBy(String c) {
				
    return repository.findByNameLike(c);
	}

	public void deleteById(int id) {
	
		repository.deleteById(id);
		
	}
	


}
