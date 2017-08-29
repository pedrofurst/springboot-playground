package com.example.contact.controller;

import com.example.contact.client.PersonClient;
import com.example.contact.dto.PersonDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@AllArgsConstructor
@RestController
@RequestMapping(value = "contacts", produces = APPLICATION_JSON_VALUE)
public class ContactController {

	private PersonClient personClient;

	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping("{document}")
	public ResponseEntity<PersonDTO> fetchByDocument(@PathVariable("document") Long document) {
		return ResponseEntity.ok( personClient.fetchByDocument( document ) );
	}

	public ResponseEntity<PersonDTO> fallback(Long document) {
		return ResponseEntity.ok( PersonDTO.builder()
				.document( document )
				.build() );
	}

}
