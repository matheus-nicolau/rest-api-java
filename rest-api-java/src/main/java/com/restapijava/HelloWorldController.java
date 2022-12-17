package com.restapijava;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

	
	private static final String template = "Hello, %s";
	private final AtomicLong genId = new AtomicLong();
	
	
	@RequestMapping("/helloworld")
	public HelloWolrd helloWord(@RequestParam(value = "name", defaultValue = "World") String name) {	
		
		return new HelloWolrd(genId.incrementAndGet(), String.format(template, name));
		
	}
 
}
