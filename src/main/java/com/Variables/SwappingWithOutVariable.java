package com.Variables;

import java.util.Scanner;

public class SwappingWithOutVariable {
    public static void main(String[] args) {
        System.out.print("Enter a number a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter a number b: ");
        int b = sc.nextInt();
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After Swapping a: "+ a);
        System.out.println("After Swapping b: "+ b);
    }
}
