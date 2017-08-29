package com.example.person.service;

import com.example.person.dao.Person;
import com.example.person.dao.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService {

	private PersonRepository repository;

	public Person fetchByDocument(Long document) {
		return repository.findByDocument( document );
	}

}
