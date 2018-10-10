package com.majid.triangle.model;

/**
 * This class is represents a triangle and the validation method of it.
 * 
 * @author Majid Ghaffuri
 */
public abstract class Triangle {
    
    public enum TriangleType{
        EQUILATERAL,
        ISOSCELES,
        SCALENE
    }
    
    protected final int sideA;
    protected final int sideB;
    protected final int sideC;
    
    Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public abstract TriangleType getType();

    @Override
    public String toString() {
        return "This is a triangle of type " + getType() 
                + " with sides length " + this.sideA + ", " + this.sideB + ", " + sideC;
    }
    
    /**
     * Validate if this sides lengths could form a triangle
     * 
     * @param sideA Length of sideA
     * @param sideB Length of sideB
     * @param sideC Length of sideC
     * @return {@code true} if could form a triangle and {@code false} if couldn't
     */
    final static boolean isValidTriangle(int sideA, int sideB, int sideC){
        /* Check for positive sides lengths */
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
           return false;
        }
       
        /**
         * Check for if sides lengths form a triangle
         * Subtracting used because of not exceeding the Integer.MAX_VALUE 
         */
        return sideA > sideB - sideC // sideA + sideC > sideB
            && sideA > sideC - sideB // sideA + sideB > sideC
            && sideB > sideA - sideC;// SideB + sideC > sideA
   }
}
