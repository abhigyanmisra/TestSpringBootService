package com.code.HelloName.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloNameController {
	@GetMapping("/SanchitaSGreeting/{firstName}/{lastName}")
	public String helloName(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		return "Hello " + firstName + " " + lastName;

	}
}