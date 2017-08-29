package com.example.person.config;

import com.example.person.dao.Person;
import com.example.person.dao.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@AllArgsConstructor
@Log
public class PersonInitializer implements CommandLineRunner {

	private PersonRepository repository;

	@Override public void run(String... args) throws Exception {
		Stream.of(
				buildUser( "John", "john@example.com", 111l ),
				buildUser( "Mark", "mark@example.com", 222l ),
				buildUser( "Steve", "steve@example.com", 333l )
		).forEach( user -> {
			log.info( "Sucefully saved: " + repository.save( user ) );
		} );
	}

	private Person buildUser(String name, String email, Long document) {
		return Person.builder()
				.name( name )
				.email( email )
				.document( document )
				.build();
	}

}
