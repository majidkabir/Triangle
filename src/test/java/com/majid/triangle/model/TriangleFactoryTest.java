package com.majid.triangle.model;

import com.majid.triangle.model.Triangle.TriangleType;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * @author Majid Ghaffuri
 */
public class TriangleFactoryTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void testZeroSideALength() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(0, 5, 10);
    }

    @Test
    public void testZeroSideBLength() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(30, 0, 10);
    }

    @Test
    public void testZeroSideCLength() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(10, 5, 0);
    }
    
    @Test
    public void testNegetiveSideALength() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(-10, 5, 10);
    }
    
    @Test
    public void testNegetiveSideBLength() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(10, -5, 20);
    }
    
    @Test
    public void testNegetiveSideCLength() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(10, 5, -10);
    }
            
    @Test
    public void testNotFormTriangleA() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(20, 5, 5);
    }

    @Test
    public void testNotFormTriangleB() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(10, 20, 5);
    }
    @Test
    public void testNotFormTriangleC() {
        thrown.expect(IllegalArgumentException.class);
        TriangleFactory.createTriangle(20, 5, 30);
    }
    
    @Test
    public void testInvalidEquilateral() {
        assertNotEquals(TriangleType.EQUILATERAL, 
                TriangleFactory.createTriangle(10, 10, 9).getType());
        
        assertNotEquals(TriangleType.EQUILATERAL, 
                TriangleFactory.createTriangle(11, 10, 9).getType());
        
        assertNotEquals(TriangleType.EQUILATERAL, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE - 1, 
                        Integer.MAX_VALUE, Integer.MAX_VALUE).getType());
    }
    
    @Test
    public void testValidEquilateral(){
        assertEquals(TriangleType.EQUILATERAL, 
                TriangleFactory.createTriangle(10, 10, 10).getType());
        
        assertEquals(TriangleType.EQUILATERAL, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE, 
                        Integer.MAX_VALUE, Integer.MAX_VALUE).getType());
        
        assertEquals(TriangleType.EQUILATERAL, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE - 1, 
                        Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1).getType());
    }
    
    @Test
    public void testInvalidIsosceles(){
        assertNotEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(10, 8, 9).getType());
        
        assertNotEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE, 
                        Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2).getType());
    }
    
    @Test
    public void testValidIsosceles(){
        assertEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(10, 10, 5).getType());        

        assertEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(5, 10, 10).getType());        

        assertEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(10, 5, 10).getType());        

        assertEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE, 
                        Integer.MAX_VALUE, Integer.MAX_VALUE - 1).getType());        

        assertEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE, 
                        Integer.MAX_VALUE - 1, Integer.MAX_VALUE).getType());        

        assertEquals(TriangleType.ISOSCELES, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE - 1, 
                        Integer.MAX_VALUE, Integer.MAX_VALUE).getType());        
    }
    
    @Test
    public void testInvalidScalene(){
        assertNotEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(30, 30, 5).getType());        

        assertNotEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(10, 5, 10).getType());        

        assertNotEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(10, 20, 20).getType());        

        assertNotEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(20, 20, 20).getType());        
        
        assertNotEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE, 
                        Integer.MAX_VALUE - 1, Integer.MAX_VALUE).getType());        

        assertNotEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE, 
                        Integer.MAX_VALUE, Integer.MAX_VALUE).getType());        
    }
    
    @Test
    public void testValidScalene(){
        assertEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(8, 10, 13).getType());                
        
        assertEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE - 1, 
                        Integer.MAX_VALUE, Integer.MAX_VALUE - 2).getType());                
        
        assertEquals(TriangleType.SCALENE, 
                TriangleFactory.createTriangle(Integer.MAX_VALUE / 2, 
                        Integer.MAX_VALUE - 1, Integer.MAX_VALUE).getType());                
    }
}
