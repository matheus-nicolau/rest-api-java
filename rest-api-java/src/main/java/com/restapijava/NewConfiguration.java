package com.restapijava;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfiguration {
	
	@Bean(name = "introductionApi")
	public  String helloBean() {
		
		return "Olá Bean :D";
	}

}
