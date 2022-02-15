package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloController {
	@GetMapping("/SanchitaGreeting/{firstname}/{lastname}")
	public String HelloName(@PathVariable("firstname")String firstname,@PathVariable("lastname")String lastname){
			return "Hello" + firstname + lastname;
	}
	}
