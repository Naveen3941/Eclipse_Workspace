package com.example.LaptopDirectory.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.LaptopDirectory.Model.Laptop;
import com.example.LaptopDirectory.Service.LaptopService;

@RestController
public class LaptopController {
	@Autowired
	LaptopService service;

	@PostMapping("/save")
	public void saveAll(@RequestBody Laptop l1) {

		service.saveAll(l1);
	}

	@GetMapping("/getOne/{id}")
	public Optional<Laptop> getOne(@PathVariable("id") int id) {

		return (Optional<Laptop>) service.getOne(id);
	}

	@GetMapping("/getAll")
	public List<Laptop> getAll() {
		return service.getAll();
	}

	@GetMapping("/checkObject")
	public boolean checkObject() {
		Boolean b1 = service.checkObject();
		return b1;
     }
	
	@GetMapping("/getEmail")
	public List<String> getEmails()
	{
		return service.getEmail();
	}
	
	@GetMapping("/name/{name1}")
	public String getName(@PathVariable("name1") String name)
	{
		System.out.println("entered....."+name);
	 return	service.getName(name);
	}
	
	@PutMapping("/updateColumn/{id}")
	public void updateColumn(@PathParam("id") int id,@RequestParam(value="param1", required=true) String name)
	{
		System.out.println(id+"........"+name);
		service.updateColumn(id,name);
	}
	@DeleteMapping("/deleteAll")
	public void deleteAll()
	{
		service.deleteAll();
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable("id") int id)
	{
		service.deleteById(id);
	}

}
