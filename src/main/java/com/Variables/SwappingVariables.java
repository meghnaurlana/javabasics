package com.Variables;

import java.util.Scanner;

public class SwappingVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value a: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value b: ");
        int b = sc.nextInt();
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped first value a: " + a);
        System.out.println("Swapped first value b: " + b);

    }
}
