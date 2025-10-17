package com.vitorcamilodev.mongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.vitorcamilodev.mongo.domain.User;
import com.vitorcamilodev.mongo.repositories.UserRepository;

@Configuration
public class Instantiate implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User anna = new User(null, "Anna White", "anna@gmail.com");
		User john = new User(null, "John Black", "john@gmail.com");
		User laura = new User(null, "Laura Smith", "laura@gmail.com");
		User peter = new User(null, "Peter Johnson", "peter@gmail.com");
		User emily = new User(null, "Emily Davis", "emily@gmail.com");
		
		userRepository.saveAll(Arrays.asList(anna, john, laura, peter, emily));
	}

}
