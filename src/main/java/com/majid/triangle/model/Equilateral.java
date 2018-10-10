package com.majid.triangle.model;

/**
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
    
    public static boolean isValidEquilateral(int sideA, int sideB, int sideC){
        return true;
    }
}
