package domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import domain.entity.Cliente;

@Repository
public class Clientes {

	private static String INSERT = "INSERT INTO CLIENTE (NOME) VALUES (?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Cliente persist(Cliente cliente) {
		
		jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()});
		return cliente;
	}
	
	
}
