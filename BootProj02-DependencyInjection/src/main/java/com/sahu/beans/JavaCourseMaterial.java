// File: src/main/java/com/sahu/beans/JavaCourseMaterial.java
package com.sahu.beans;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

/**
 * Course material for Java courses, implementing ICourseMaterial interface.
 */
@Component("java") // Registers this class as a Spring bean with the name "java"
@Slf4j // Lombok annotation to generate a logger
public final class JavaCourseMaterial implements ICourseMaterial {

    /**
     * Constructor that logs the creation of the JavaCourseMaterial instance.
     */
    public JavaCourseMaterial() {
        log.info("JavaCourseMaterial instantiated");
    }

    /**
     * Provides the content specific to the Java course.
     * 
     * @return Course content as a String.
     */
    @Override
    public String courseContent() {
        return "1. OOPS\n2. Exception Handling\n3. Collection";
    }

    /**
     * Provides the price of the Java course.
     * 
     * @return Price as a double.
     */
    @Override
    public double price() {
        return 400.0;
    }
}
