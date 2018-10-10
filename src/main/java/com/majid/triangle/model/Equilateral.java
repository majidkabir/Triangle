package com.majid.triangle.model;

/**
 * An equilateral triangle is a triangle in which all three sides are equal,
 * this class represent an equilateral triangle
 * 
 * @author Majid Ghaffuri
 */
public class Equilateral extends Triangle{

    /* The constructor is protected becuase it should be created just with TriangleFactory*/
    protected Equilateral(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);        
    }

    @Override
    public TriangleType getType() {
        return TriangleType.EQUILATERAL;
    }
    
    /**
     * If all three sides of the triangle are equal length, it is a equilateral.
     * Because this method just used in the TrinangleFactory and before calling
     * this method, isValidTriangle method called I don't double check this here.
     * 
     * @param sideA Length of side A
     * @param sideB Length of side B
     * @param sideC Length of side C
     * @return {@code true} if could form an equilateral triangle 
     *         and {@code false} if couldn't
     */
    final static boolean isValidEquilateral(int sideA, int sideB, int sideC){
        return sideA == sideB && sideB == sideC;
    }
}
