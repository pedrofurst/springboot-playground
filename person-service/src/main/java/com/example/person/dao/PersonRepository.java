package com.example.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
	Person findByDocument(Long document);
}
