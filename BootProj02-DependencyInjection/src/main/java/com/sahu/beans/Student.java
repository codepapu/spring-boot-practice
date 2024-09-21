// File: src/main/java/com/sahu/beans/Student.java
package com.sahu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

/**
 * Represents a student who prepares for exams using course materials.
 */
@Component("stu") // Registers this class as a Spring bean with the name "stu"
@Slf4j // Lombok annotation to generate a logger
public final class Student {

    // Injects the course material using Spring's dependency injection
    @Autowired
    @Qualifier("java") // Specifies to use the Java course material; change to "dotNet" or "ui" as needed
    private ICourseMaterial material;

    /**
     * Prepares for the specified exam using the injected course material.
     * 
     * @param examName The name of the exam.
     */
    public void preparation(String examName) {
        log.info("Preparation started for {}", examName);
        
        // Retrieve course content and price from the material
        String courseContent = material.courseContent();
        double price = material.price();
        
        // Log the preparation details
        log.info("Preparation is going on using:\n{}\nwith price {}", courseContent, price);
        
        log.info("Preparation is completed for {}", examName);
    }
}
