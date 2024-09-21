// File: src/main/java/com/sahu/beans/DotNetCourseMaterial.java
package com.sahu.beans;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

/**
 * Course material for .NET courses, implementing ICourseMaterial interface.
 */
@Component("dotNet") // Registers this class as a Spring bean with the name "dotNet"
@Slf4j // Lombok annotation to generate a logger
public final class DotNetCourseMaterial implements ICourseMaterial {

	/**
	 * Constructor that logs the creation of the DotNetCourseMaterial instance.
	 */
	public DotNetCourseMaterial() {
		log.info("DotNetCourseMaterial instantiated");
	}

	/**
	 * Provides the content specific to the .NET course.
	 * 
	 * @return Course content as a String.
	 */
	@Override
	public String courseContent() {
		return "1. C# OOPS\n2. C# Exception Handling\n3. C# Collection";
	}

	/**
	 * Provides the price of the .NET course.
	 * 
	 * @return Price as a double.
	 */
	@Override
	public double price() {
		return 300.0;
	}
}
