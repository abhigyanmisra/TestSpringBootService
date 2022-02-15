package com.infinity.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class HelloController {
	
	@GetMapping("/MuskanProject/{name}/{lastname}")
	public String hello(@PathVariable("name")String name,@PathVariable("lastname")String lastname) 
	{
		return "Hello "+name+ lastname;
	}
}
