package com.Variables;

import java.util.*;

public class SemiPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input of a");
        int a = sc.nextInt();
        System.out.println("Enter input of b");
        int b = sc.nextInt();
        System.out.println("Enter input of c");
        int c = sc.nextInt();
        double SemiPerimeter = a + b + c / 2;
        System.out.println("The SemiPerimeter of a,b,c" + " " + SemiPerimeter);
    }
}
