package com.sahu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sahu.beans.Student;

import lombok.extern.slf4j.Slf4j;

/**
 * Entry point for the Spring Boot Dependency Injection Application.
 */
@RestController
@SpringBootApplication
@Slf4j // Lombok annotation for logging
public class BootProj02DependencyInjectionApplication {

	@Autowired
    private Student student; // Inject the Student bean

    /**
     * Endpoint to get preparation details for a specific exam.
     *
     * @param examName Name of the exam.
     * @return Preparation details as a String.
     */
	@GetMapping("/preparation")
	public String getPreparation(@RequestParam String examName) {
	    student.preparation(examName);
	    return "Preparation completed for the exam: " + examName;
	}

	public static void main(String[] args) {
		// Get IoC container
		ApplicationContext context = SpringApplication.run(BootProj02DependencyInjectionApplication.class, args);
		log.info("1.Spring Boot application started and IoC container initialized.");

		// Get target Spring bean
		Student student = context.getBean("stu", Student.class);
		log.info(".Retrieved Student bean from the IoC container.");

		// Invoke business method
		student.preparation("CTS-interview");
		log.info("Preparation completed for the exam: CTS-interview");
			
		// Close container
		((ConfigurableApplicationContext) context).close();
		log.info("Spring Boot application context closed.");
	}
}
