package com.majid.triangle.model;

/**
 * @author Majid Ghaffuri
 */
public class Isosceles extends Triangle{

    protected Isosceles(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public TriangleType getType() {
        return TriangleType.ISOSCELES;
    }
   
    public static boolean isValidIsosceles(int sideA, int sideB, int sideC){
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }
}
