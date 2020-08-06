package com.app.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@GetMapping("/home")
	public String showMsg() {
		
		return "Welcome to Spring Boot Application="+new Date();
	}
	
	
	

}
