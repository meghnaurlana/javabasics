package com.Oop;

import java.awt.geom.Area;

public class EncapsulationUsage {
    public static void main(String[] args) {
        Encapsulation c = new Encapsulation(10);
        c.setDiameter(12);
        System.out.println("radius " + c.getRadius());
        System.out.println("Diameter " + c.getDiameter());
        c.Area();
        System.out.println("Area "+c.Area());
    }

}
