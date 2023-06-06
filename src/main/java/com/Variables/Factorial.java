package com.Variables;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num = 1;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            num = num * i;
        }
        System.out.println("The factorial of given number " + x + " : " + num);
    }
}
