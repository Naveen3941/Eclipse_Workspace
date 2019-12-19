package com.validation.service;

import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.validation.model.Employee;
import com.validation.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	private HomeRepository repo;
	@Autowired
	private JavaMailSender sender;

	public ResponseEntity<Object> saveAllData(Employee emp) {
		String email=emp.getEmail();
		
		Employee save = repo.save(emp);
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		String token = UUID.randomUUID().toString();
		String url
		=  "http://localhost:8089/activate" ;

		try {
			helper.setTo(email);
			helper.setText("Hi " + emp.getFirstName() + " you have succesfully registration   "+url+"/"+emp.getFirstName());
			
			helper.setSubject("Mail From Spring Boot");
		} catch (MessagingException e) {
			e.printStackTrace();

		}
		sender.send(message);
		if(save != null) {
			return new ResponseEntity<>("registration successfully", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("registration failed",HttpStatus.UNPROCESSABLE_ENTITY);
		}
	}

	public String message(String id) {
		System.out.println("Inserted.............");
		repo.updateEmployeeSetEmailForIdNative("true", id);
		return "Inserted";
	}

}


