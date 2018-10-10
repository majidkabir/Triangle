package com.majid.triangle.model;

/**
 * @author Majid Ghaffuri
 */
public class TriangleFactory {
    
    public static Triangle createTriangle(int sideA, int sideB, int sideC){        
        if (!Triangle.isValidTriangle(sideA, sideB, sideC)){
            throw new IllegalArgumentException();
        }

        Triangle triangle;
        
        if (Equilateral.isValidEquilateral(sideA, sideB, sideC)) {
            triangle = new Equilateral(sideA, sideB, sideC);
            
        } else if (Isosceles.isValidIsosceles(sideA, sideB, sideC)) {
            triangle = new Isosceles(sideA, sideB, sideC);
            
        } else {
            triangle = new Scalene(sideA, sideB, sideC);            
        }
        
        return triangle;
    }
}
