package com.aguiiarlucas.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aguiiarlucas.project.entities.Order;
import com.aguiiarlucas.project.entities.User;
import com.aguiiarlucas.project.entities.enums.OrderStatus;
import com.aguiiarlucas.project.repositories.OrderRepository;
import com.aguiiarlucas.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	
	//[ Declarando Dependencia ] 
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@hotmail.com", "997205369", "123456");
		User u2 = new User(null, "Bob Green", "bob@hotmail.com", "32037565", "789456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.CANCELED, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID,u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED,u1);

		userRepository .saveAll(Arrays.asList(u1,u2)); //[ Cria uma lista e salva no Banco de Dados]
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
}
