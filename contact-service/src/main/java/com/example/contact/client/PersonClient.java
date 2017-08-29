package com.example.contact.client;

import com.example.contact.dto.PersonDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("person-service")
public interface PersonClient {

	@GetMapping("/people/{document}/")
	PersonDTO fetchByDocument(@PathVariable("document") Long document);

}
