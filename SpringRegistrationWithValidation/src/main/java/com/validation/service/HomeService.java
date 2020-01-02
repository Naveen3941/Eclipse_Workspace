package com.validation.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.validation.model.Employee;
import com.validation.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	private HomeRepository repo;
	@Autowired
	private JavaMailSender sender;

	public ResponseEntity<Object> saveAllData(Employee emp)  {
		String email=emp.getEmail();
		
		Employee save = repo.save(emp);
		
		SimpleMailMessage helper = new SimpleMailMessage();
		String token = UUID.randomUUID().toString();
		String url
		=  "http://localhost:8089/activate" ;
		helper.setTo(email);
		helper.setText("Hi " + emp.getFirstName() + " you have succesfully registration   "+url+"/"+emp.getFirstName());
		helper.setSubject("Mail From Spring Boot");
		sender.send(helper);
		if(save != null) {
			return new ResponseEntity<>("registration successfully", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("registration failed",HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}

	public ResponseEntity<Object> message(String id) {
		System.out.println("Inserted.............");
		
		boolean b=repo.updateEmployeeSetEmailForIdNative("true", id);
		if(b) {
			return new ResponseEntity<>("registration successfully", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("registration failed",HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}

}


