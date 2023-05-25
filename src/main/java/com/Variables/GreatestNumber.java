package com.Variables;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three inputs ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
if (max<b){
    max = b;
} if (max<c) {
max = c;
}
        System.out.println("The Max is "+max);
    }
}
