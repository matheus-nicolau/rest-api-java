package com.restapijava;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class RestApiJavaApplication {

//@ComponentScan(basePackages = {
//	"repository",
//	"service",
//	"model" }
//)
	
	@Value("${spring.application.name}")
	private String appProp;
	
	
//	@Autowired
//	@Qualifier("introductionApi")
//	private String introductionApi;
	
	@GetMapping("/helloworld")
	public String helloworld() {
		
		return appProp;
	};
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiJavaApplication.class, args);
		 
		
	}

}
