package com.majid.triangle.model;

/**
 * An equilateral triangle is a triangle in which all three sides are equal,
 * this class represent an equilateral triangle
 * 
 * @author Majid Ghaffuri
 */
public class Equilateral extends Triangle{

    protected Equilateral(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);        
    }

    @Override
    public TriangleType getType() {
        return TriangleType.EQUILATERAL;
    }
    
    /**
     * If all three sides of the triangle are equal length, it is a equilateral
     * 
     * @param sideA Length of side A
     * @param sideB Length of side B
     * @param sideC Length of side C
     * @return {@code true} if could form an equilateral triangle 
     *         and {@code false} if couldn't
     */
    public static boolean isValidEquilateral(int sideA, int sideB, int sideC){
        return sideA == sideB && sideB == sideC;
    }
}
