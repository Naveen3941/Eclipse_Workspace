package com.sendingmail.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sendingmail.service.EmailService;

@RestController
public class MyController {
	 @Autowired
	    private JavaMailSender sender;

	    @RequestMapping("/sendMail")
	    public String sendMail() {
	        MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);

	        try {
	            helper.setTo("challanavin521@gmail.com");
	            helper.setText("Hi RamaKrishna you got selected for Java Trainee)");
	            helper.setSubject("Mail From Spring Boot");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            return "Error while sending mail ..";
	        }
	        sender.send(message);
	        return "Mail Sent Success!";
	    }

}
