package com.infinityventures.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	  @GetMapping("/anujGreeting/{firstname}/{lastname}")
	  public String anujGreeting(@PathVariable("firstname") String firstname,@PathVariable("lastname") String lastname)
	  {
	      return "Hello " + firstname + " " + lastname;
	  }
	
}
