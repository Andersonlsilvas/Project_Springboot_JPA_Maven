package com.andersonsantos.Project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andersonsantos.Project.entities.Order;
import com.andersonsantos.Project.entities.User;
import com.andersonsantos.Project.repositories.OrderRepository;
import com.andersonsantos.Project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2024-03-14T10:29:10Z"),u1);
		Order o2 = new Order(null, Instant.parse("2024-03-14T10:32:50Z"),u2);
		Order o3 = new Order(null, Instant.parse("2024-03-14T10:40:30Z"),u1);

		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	

}

