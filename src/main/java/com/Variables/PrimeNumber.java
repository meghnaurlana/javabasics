package com.Variables;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is prime number or not: ");
        int x = sc.nextInt();
        int num = x / 2;
        int temp = 0;
        if (x == 0 || x == 1) {
            System.out.println(x + " is not prime number");
        } else {
            for (int i = 2; i <= num; i++) {
                if (x % i == 0) {
                    System.out.println(x + " is not prime number");
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.println(x + " is prime number");
            }
        }

    }
}
