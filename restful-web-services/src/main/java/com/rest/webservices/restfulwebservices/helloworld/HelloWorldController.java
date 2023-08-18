package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping("/helloworldbean")
	public HelloworldBean helloworldBean() {
		return new HelloworldBean("Hello world bean");
		
	}

}
