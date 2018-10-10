package com.majid.triangle.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Majid Ghaffuri
 */
public class TriangleTest {
    
    @Test
    public void testZeroInvalidTriangle() {
        assertEquals(false, Triangle.isValidTriangle(0, 10, 5));
        assertEquals(false, Triangle.isValidTriangle(10, 0, 5));
        assertEquals(false, Triangle.isValidTriangle(10, 10, 0));
    }

    @Test
    public void testNegetiveInvalidTriangle() {
        assertEquals(false, Triangle.isValidTriangle(-1, 10, 5));
        assertEquals(false, Triangle.isValidTriangle(10, -5, 5));
        assertEquals(false, Triangle.isValidTriangle(10, 10, -2));
        assertEquals(false, Triangle.isValidTriangle(Integer.MIN_VALUE, 10, 10));
        assertEquals(false, Triangle.isValidTriangle(10, Integer.MIN_VALUE, 10));
        assertEquals(false, Triangle.isValidTriangle(10, 10, Integer.MIN_VALUE));
    }
    
    @Test
    public void testInvalidTriangle() {
        assertEquals(false, Triangle.isValidTriangle(10, 10, 30));
        assertEquals(false, Triangle.isValidTriangle(40, 20, 13));
        assertEquals(false, Triangle.isValidTriangle(10, 35, 15));
        assertEquals(false, Triangle.isValidTriangle(Integer.MAX_VALUE, 10, 30));
        assertEquals(false, Triangle.isValidTriangle(10, Integer.MAX_VALUE, 30));
        assertEquals(false, Triangle.isValidTriangle(10, 30, Integer.MAX_VALUE));
        
        assertEquals(false, Triangle.isValidTriangle(5, 3, 8));
        assertEquals(false, Triangle.isValidTriangle(10, 3, 7));
        assertEquals(false, Triangle.isValidTriangle(8, 15, 7));
    }
}
