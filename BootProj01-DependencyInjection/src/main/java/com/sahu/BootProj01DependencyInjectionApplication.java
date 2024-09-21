package com.sahu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@SpringBootApplication
@Slf4j 
public class BootProj01DependencyInjectionApplication {

	@GetMapping("/")
	String home() {
		log.info("Home endpoint accessed");
		return "Hello World!";
	}

	public static void main(String[] args) {
		log.info("Starting Spring Boot Application"); 
		SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
	}

}
