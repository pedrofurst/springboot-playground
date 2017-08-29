package com.example.person.controller;

import com.example.person.dao.Person;
import com.example.person.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "people", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class PersonController {

	private PersonService service;

	@GetMapping("{document}")
	public ResponseEntity<Person> fetchByDocument(@PathVariable("document") Long document) {
		return ok( service.fetchByDocument( document ) );
	}

}
