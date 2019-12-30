package com.java.H2IntegrationWithSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.H2IntegrationWithSpringBoot.model.Employee;
import com.java.H2IntegrationWithSpringBoot.service.JpaService;

@RestController
public class JpaController {
	@Autowired
	JpaService service;
	
	@PostMapping("/saveAllJpa")
	
	public void savedAll(@RequestBody List<Employee> emp)
	{
		System.out.println("entered.....");
		service.savedAll(emp);
	}
	@GetMapping("/getSort")
	public List<Employee> findSort(Sort sort)
	{
		List<Employee> e1=service.findSort(sort);
		return e1;
	}
	@GetMapping("/page")
	public Page<Employee> findPage(Pageable page)
	{
		Page<Employee> e2=service.findPage(page);
		return e2;
	}
	@PostMapping("/flush")
	public void flushing(@RequestBody Employee emp)
	{
		service.flushing(emp);
	}
    @DeleteMapping("/deleteByBatch")
    public void deleteBatch()
    {
    	service.deleteBatch();
    }
    @PostMapping("/flushsave")
    public void flushAndSave(Employee emp)
    {
    	service.flushAndSave(emp);
    }
    @GetMapping("/findName/{nameby}")
    public List<Employee> findByName(@PathVariable("nameby") String name)
    {
    	List<Employee> e1=service.findByName(name);
    	return e1;
    }
    @GetMapping("/findIdName/{fid}/{fname}")
    public Employee findByIdAndName(@PathVariable("fid") int id,@PathVariable("fname") String name)
    {
    	Employee e1=service.findByIdAndName(id,name);
    	return e1;
    }
    @GetMapping("/findIdOrName/{fid}/{fname}")
    public List<Employee> findByIdOrName(@PathVariable("fid") int id,@PathVariable("fname") String name)
    {
    	System.out.println("entered...");
    	List<Employee> e1=service.findByIdOrName(id,name);
    	return e1;
    }
    @GetMapping("/findAll")
    public Iterable<Employee> findAll()
    {
    	return service.findAll();
    }
    
    @GetMapping("/findAllById")
    Iterable<Employee> findAllById(@RequestBody Iterable<Integer> ids)
	{
	  	
		return service.findAllById(ids);
	}
    @GetMapping("/findbynamecontain/{fname}")
    public List<Employee> findByNameContaining(@PathVariable("fname") String name)
    {
    	return service.findByNameContaining(name);
    }
    @GetMapping("/like/{fc}")
    public List<Employee> likeBy(@PathVariable("fc") String c)
    {
    	return service.likeBy(c);
    }
    @DeleteMapping("deletebyid/{did}")
    public void deleteById(@PathVariable("did") int id)
    {
    	service.deleteById(id);
    }
    
    
    
    
    
    
}
