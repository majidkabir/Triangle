package com.majid.triangle.model;

/**
 * Triangle factory create a {@link Triangle}, it determined the type of it based on
 * the length of sides and return the correct type ({@link Scalene}, 
 * {@link Isosceles} or {@link Equilateral})
 * 
 * @author Majid Ghaffuri
 */
public class TriangleFactory {
    
    /**
     * Validate the triangle by sides length and create the correct object 
     * based on the sides length.
     * 
     * @param sideA Length of side A
     * @param sideB Length of side B
     * @param sideC Length of side C
     * @throws IllegalArgumentException If any side has non-positive length
     * or sides lengths can't form a triangle
     * @return The created {@link Triangle}
     */
    public static Triangle createTriangle(int sideA, int sideB, int sideC){        

        if (!Triangle.isValidTriangle(sideA, sideB, sideC)){
            throw new IllegalArgumentException();
        }

        Triangle triangle;
        
        /* Order of this validations is important */
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
