package com.restapijava;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import domain.entity.Cliente;
import domain.repository.Clientes;




@SpringBootApplication
public class RestApiJavaApplication {	

	
	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Matheus");
			clientes.persist(cliente);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(RestApiJavaApplication.class, args);
		 
		
	}

}
