package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@GetMapping("/sanchitaGreeting")
	 public String greeting(String firstname,String lastname){
	    firstname="sanchita";
		String greeting = "hello " + firstname;
		return greeting;
	}
	
}
