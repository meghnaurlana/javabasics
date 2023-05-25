package com.conditionalStatments;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age:");
        int a = sc.nextInt();
        if(a>=18){
            System.out.println("Your are  eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
    }
}
