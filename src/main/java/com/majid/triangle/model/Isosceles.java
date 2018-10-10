package com.majid.triangle.model;

/**
 * An isosceles triangle is a triangle that has two sides of equal length,
 * this class represent an isosceles triangle
 * 
 * @author Majid Ghaffuri
 */
public class Isosceles extends Triangle{

    /* The constructor is protected becuase it should be created just with TriangleFactory*/
    protected Isosceles(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public TriangleType getType() {
        return TriangleType.ISOSCELES;
    }
   
    /**
     * If two sides of the triangle has equal length, it is a isosceles.
     * Because this method just used in the TrinangleFactory and before calling
     * this method, isValidTriangle method called I don't double check this here.
     * 
     * @param sideA Length of side A
     * @param sideB Length of side B
     * @param sideC Length of side C
     * @return {@code true} if could form an isosceles triangle 
     *         and {@code false} if couldn't
     */
    final static boolean isValidIsosceles(int sideA, int sideB, int sideC){
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }
}
