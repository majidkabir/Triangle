package com.majid.triangle.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Majid Ghaffuri
 */
public class EquilateralTest {
    
    @Test
    public void testValidEquilateral() {
        assertTrue(Equilateral.isValidEquilateral(1, 1, 1));
        assertTrue(Equilateral.isValidEquilateral(Integer.MAX_VALUE, 
                Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
    
    @Test
    public void testInvalidEquilateral() {
        assertFalse(Equilateral.isValidEquilateral(1, 2, 3));
        assertFalse(Equilateral.isValidEquilateral(10, 20, 20));
        assertFalse(Equilateral.isValidEquilateral(20, 19, 20));
        assertFalse(Equilateral.isValidEquilateral(20, 20, 19));
        assertFalse(Equilateral.isValidEquilateral(Integer.MAX_VALUE, 
                Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        assertFalse(Equilateral.isValidEquilateral(Integer.MAX_VALUE, 
                Integer.MAX_VALUE - 1, Integer.MAX_VALUE));
        assertFalse(Equilateral.isValidEquilateral(Integer.MAX_VALUE - 1, 
                Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
    
}
