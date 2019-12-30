package com.example.SpringSecurityExample.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping("/check")
	public String getName(@RequestParam String name,Principal user)
	{
		return "Welcome to Java";
	}

}
