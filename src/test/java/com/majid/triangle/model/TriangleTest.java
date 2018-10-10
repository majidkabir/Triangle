package com.majid.triangle.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Majid Ghaffuri
 */
public class TriangleTest {
    
    @Test
    public void testZeroInvalidTriangle() {
        assertFalse(Triangle.isValidTriangle(0, 10, 5));
        assertFalse(Triangle.isValidTriangle(10, 0, 5));
        assertFalse(Triangle.isValidTriangle(10, 10, 0));
    }

    @Test
    public void testNegetiveInvalidTriangle() {
        assertFalse(Triangle.isValidTriangle(-1, 10, 5));
        assertFalse(Triangle.isValidTriangle(10, -5, 5));
        assertFalse(Triangle.isValidTriangle(10, 10, -2));
        assertFalse(Triangle.isValidTriangle(Integer.MIN_VALUE, 10, 10));
        assertFalse(Triangle.isValidTriangle(10, Integer.MIN_VALUE, 10));
        assertFalse(Triangle.isValidTriangle(10, 10, Integer.MIN_VALUE));
    }
    
    @Test
    public void testInvalidTriangle() {
        assertFalse(Triangle.isValidTriangle(10, 10, 30));
        assertFalse(Triangle.isValidTriangle(40, 20, 13));
        assertFalse(Triangle.isValidTriangle(10, 35, 15));
        assertFalse(Triangle.isValidTriangle(Integer.MAX_VALUE, 10, 30));
        assertFalse(Triangle.isValidTriangle(10, Integer.MAX_VALUE, 30));
        assertFalse(Triangle.isValidTriangle(10, 30, Integer.MAX_VALUE));
        
        assertFalse(Triangle.isValidTriangle(5, 3, 8));
        assertFalse(Triangle.isValidTriangle(10, 3, 7));
        assertFalse(Triangle.isValidTriangle(8, 15, 7));
    }
}
