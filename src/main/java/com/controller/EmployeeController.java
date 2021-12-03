package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@GetMapping(value = "sayHello")
	public String greeting() {
		return "Welcome to Spring Boot using Docker";
	}
	
	@GetMapping(value = "welcome/{name}")
	public String sayWelcome(@PathVariable("name")String name) {
		return "Welcome to Spring Boot using Docker User"+name;
	}
}
