// File: src/main/java/com/sahu/beans/UICourseMaterial.java
package com.sahu.beans;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

/**
 * Course material for UI courses, implementing ICourseMaterial interface.
 */
@Component("ui") // Registers this class as a Spring bean with the name "ui"
@Slf4j // Lombok annotation to generate a logger
public final class UICourseMaterial implements ICourseMaterial {

	/**
	 * Constructor that logs the creation of the UICourseMaterial instance.
	 */
	public UICourseMaterial() {
		log.info("UICourseMaterial instantiated");
	}

	/**
	 * Provides the content specific to the UI course.
	 * 
	 * @return Course content as a String.
	 */
	@Override
	public String courseContent() {
		return "1. HTML\n2. CSS\n3. JavaScript";
	}

	/**
	 * Provides the price of the UI course.
	 * 
	 * @return Price as a double.
	 */
	@Override
	public double price() {
		return 200.0;
	}
}
