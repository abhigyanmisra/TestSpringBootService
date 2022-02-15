package com.practice.practiceSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeSpringController {
	@GetMapping("/YashGreeting/{name}/{secondname}")
	public String HelloWorld(@PathVariable("name")String name,@PathVariable("secondname")String secondname){
			return "Hello" + name + secondname;
	}
	/*
	 * @PostMapping( value = "/createName", consumes = "application/json", produces
	 * = "application/json") public String Save() { return null;
	 * 
	 * }
	 */
}


