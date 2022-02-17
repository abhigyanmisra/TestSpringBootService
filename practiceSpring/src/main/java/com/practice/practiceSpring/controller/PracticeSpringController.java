package com.practice.practiceSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.practice.practiceSpring.Entity.Name;
import com.practice.practiceSpring.Service.NameService;

@RestController
public class PracticeSpringController {
	@Autowired
	private NameService nameservice;
	@GetMapping("/YashGreeting/{name}/{secondname}")
	public String HelloWorld(@PathVariable("name")String name,@PathVariable("secondname")String secondname){
			return "Hello" + name + secondname;
	}
	@PostMapping("YashGreeting/Name") 
	public Name addName(@RequestBody Name name) {
		return this.nameservice.addName(name);
	}
}


