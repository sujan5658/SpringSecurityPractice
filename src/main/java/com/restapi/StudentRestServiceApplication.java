package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class StudentRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestServiceApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder(12).encode("Difficult"));
	}

}
