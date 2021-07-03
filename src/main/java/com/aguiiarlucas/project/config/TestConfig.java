package com.aguiiarlucas.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aguiiarlucas.project.entities.User;
import com.aguiiarlucas.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	
	//[ Declarando Dependencia ] 
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@hotmail.com", "997205369", "123456");
		User u2 = new User(null, "Bob Green", "bob@hotmail.com", "32037565", "789456");

		userRepository .saveAll(Arrays.asList(u1,u2)); // [ Cria uma lista e salva no Banco de Dados ] 
	}
	
}
