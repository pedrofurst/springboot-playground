package com.example.contact.dto;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

	private Long id;
	private String name;
	private String email;
	private Long document;
}
