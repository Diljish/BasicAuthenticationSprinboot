package com.diljish.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Spring boot security";
		
	}
	
	@GetMapping("/byee")
	public String bye() {
		return "Spring boot security";
		
	}

}
