package com.majid.triangle.model;

/**
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
    
    public final static boolean isValidTriangle(int sideA, int sideB, int sideC){
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
           return false;
        }
       
        return Math.abs(sideA - sideB) < sideC 
            && Math.abs(sideA - sideC) < sideB
            && Math.abs(sideB - sideA) < sideC;
   }
}
