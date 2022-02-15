package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Name;
import com.example.demo.services.NameService;

@RestController
public class MyController {
	
	@Autowired
	public NameService courseserivice;
	@GetMapping("/home")
	public String home() {
	  return "Hello Harshika Chandvani";
  }
	@GetMapping("/HarshikaGreeting")
	public List<Name> getGreeting(){
		
		return this.courseserivice.getGreeting();
		
	}
}
