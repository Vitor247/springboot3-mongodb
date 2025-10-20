package com.vitorcamilodev.mongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.vitorcamilodev.mongo.domain.Post;
import com.vitorcamilodev.mongo.domain.User;
import com.vitorcamilodev.mongo.repositories.PostRepository;
import com.vitorcamilodev.mongo.repositories.UserRepository;

@Configuration
public class Instantiate implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User anna = new User(null, "Anna White", "anna@gmail.com");
		User john = new User(null, "John Black", "john@gmail.com");
		User laura = new User(null, "Laura Smith", "laura@gmail.com");
		User peter = new User(null, "Peter Johnson", "peter@gmail.com");
		User emily = new User(null, "Emily Davis", "emily@gmail.com");
		
		Post post = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo", anna);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje", anna);
		
		postRepository.saveAll(Arrays.asList(post, post2));
		userRepository.saveAll(Arrays.asList(anna, john, laura, peter, emily));
	}

}
