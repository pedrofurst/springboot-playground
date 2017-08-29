package com.example.person.dao;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
@Getter
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String email;

	@Column(unique = true)
	private Long document;
}
