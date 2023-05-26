package com.Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int size = sc.nextInt();
        int a[]= new int[size];
        int sum = 0;
        System.out.println("Enter the inputs of an Array : ");
        for (int i = 0;i<size;i++){
             a[i] = sc.nextInt();
             sum = sum +a[i];
        }
        System.out.println("Sum of an Array :"+sum);
    }
}
