package com.majid.triangle.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Majid Ghaffuri
 */
public class EquilateralTest {
    
    @Test
    public void testValidEquilateral() {
        assertEquals(true, Equilateral.isValidEquilateral(1, 1, 1));
        assertEquals(true, Equilateral.isValidEquilateral(Integer.MAX_VALUE, 
                Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
    
    @Test
    public void testInvalidEquilateral() {
        assertEquals(false, Equilateral.isValidEquilateral(1, 2, 3));
        assertEquals(false, Equilateral.isValidEquilateral(10, 20, 20));
        assertEquals(false, Equilateral.isValidEquilateral(20, 19, 20));
        assertEquals(false, Equilateral.isValidEquilateral(20, 20, 19));
        assertEquals(false, Equilateral.isValidEquilateral(Integer.MAX_VALUE, 
                Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        assertEquals(false, Equilateral.isValidEquilateral(Integer.MAX_VALUE, 
                Integer.MAX_VALUE - 1, Integer.MAX_VALUE));
        assertEquals(false, Equilateral.isValidEquilateral(Integer.MAX_VALUE - 1, 
                Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
    
}
