package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.MvcService;  
@Controller  
public class HelloController {  
	@Autowired
	MvcService service;
	
    @GetMapping("/jjj")
    public String display()  
    {  
        return "index";  
    }
    
 }  