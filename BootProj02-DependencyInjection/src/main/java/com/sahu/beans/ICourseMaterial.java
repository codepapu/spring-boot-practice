// File: src/main/java/com/sahu/beans/ICourseMaterial.java
package com.sahu.beans;

/**
 * Interface for course materials, defining methods for retrieving course content and price.
 */
public interface ICourseMaterial {
    
    /**
     * Returns the content of the course.
     * 
     * @return Course content as a String.
     */
    String courseContent();
    
    /**
     * Returns the price of the course.
     * 
     * @return Price as a double.
     */
    double price();
}
