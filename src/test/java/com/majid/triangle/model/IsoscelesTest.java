package com.majid.triangle.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Majid Ghaffuri
 */
public class IsoscelesTest {
    
    @Test
    public void testValidIsosceles() {
        assertTrue(Isosceles.isValidIsosceles(3, 3, 1));
        assertTrue(Isosceles.isValidIsosceles(2, 5, 5));
        assertTrue(Isosceles.isValidIsosceles(10, 1, 10));
        assertTrue(Isosceles.isValidIsosceles(Integer.MAX_VALUE, 
                Integer.MAX_VALUE, 10));
        assertTrue(Isosceles.isValidIsosceles(10, Integer.MAX_VALUE, 
                Integer.MAX_VALUE));
        assertTrue(Isosceles.isValidIsosceles(Integer.MAX_VALUE, 10, 
                Integer.MAX_VALUE));
    }
    
    @Test
    public void testInvalidIsosceles() {
        assertFalse(Isosceles.isValidIsosceles(3, 4, 1));
        assertFalse(Isosceles.isValidIsosceles(Integer.MAX_VALUE, 
                Integer.MAX_VALUE - 1, 1));        
        assertFalse(Isosceles.isValidIsosceles(Integer.MAX_VALUE, 
                Integer.MAX_VALUE - 1, Integer.MAX_VALUE -2));        
    }
    
}
