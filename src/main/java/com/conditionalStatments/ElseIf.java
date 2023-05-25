package com.conditionalStatments;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter time in 24hr format:");
        double time = sc.nextFloat();
        if (time < 12) {
            System.out.println("Good Morning!");
        } else if (time == 12 || time < 16) {
            System.out.println("Good Afternoon!");
        } else if (time > 16 || time < 19) {
            System.out.println("Good Evening!");
        } else if (time < 19 || time >= 24) {
            System.out.println("Good Night");
        } else {
            System.out.println("Inavlid Time");
        }
    }
}
