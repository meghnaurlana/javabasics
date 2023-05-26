package com.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the input of Array");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Output:");
        for (int i = 0; i < size; i++) {
            System.out.println("a [ " + i + " ] = " + a[i]);
        }
    }
}
