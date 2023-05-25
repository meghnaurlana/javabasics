package com.Variables;

public class TypeCasting {
    public static void main(String[] args){
        int a =10;
        double b = a;
        System.out.println("Widening:"+" "+b);

        double x = 8.9;
        int z = (int) x;
        System.out.println("Narrowing:"+ " "+z);
    }

}
