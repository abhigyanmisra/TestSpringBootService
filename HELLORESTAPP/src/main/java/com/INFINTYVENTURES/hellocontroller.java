package com.INFINTYVENTURES;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping("/anujGreeting/{firstname}/{lastname}")
    public String  hello(@PathVariable("firstname")String firstname,@PathVariable("lastname")String lastname){
		return "hello " + firstname+" "+ lastname;
    	
    }
}  
