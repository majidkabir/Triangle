package com.majid.triangle.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Majid Ghaffuri
 */
public class IsoscelesTest {
    
    @Test
    public void testValidIsosceles() {
        assertEquals(true, Isosceles.isValidIsosceles(3, 3, 1));
        assertEquals(true, Isosceles.isValidIsosceles(2, 5, 5));
        assertEquals(true, Isosceles.isValidIsosceles(10, 1, 10));
        assertEquals(true, Isosceles.isValidIsosceles(Integer.MAX_VALUE, 
                Integer.MAX_VALUE, 10));
        assertEquals(true, Isosceles.isValidIsosceles(10, Integer.MAX_VALUE, 
                Integer.MAX_VALUE));
        assertEquals(true, Isosceles.isValidIsosceles(Integer.MAX_VALUE, 10, 
                Integer.MAX_VALUE));
    }
    
    @Test
    public void testInvalidIsosceles() {
        assertEquals(false, Isosceles.isValidIsosceles(3, 4, 1));
        assertEquals(false, Isosceles.isValidIsosceles(Integer.MAX_VALUE, 
                Integer.MAX_VALUE - 1, 1));        
        assertEquals(false, Isosceles.isValidIsosceles(Integer.MAX_VALUE, 
                Integer.MAX_VALUE - 1, Integer.MAX_VALUE -2));        
    }
    
}
