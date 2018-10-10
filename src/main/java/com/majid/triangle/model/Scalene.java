package com.majid.triangle.model;

/**
 * A scalene triangle is a triangle that has three unequal sides
 * 
 * @author Majid Ghaffuri
 */
public class Scalene extends Triangle{

    protected Scalene(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public TriangleType getType() {
        return TriangleType.SCALENE;
    }
}
