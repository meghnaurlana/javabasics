package com.Variables;

public class fibonacci {
    public static void main(String[] args) {

        int num1=0,num2 =1 ,newnum;
        for (int x = 1; x < 10; x++) {
            newnum = num1 + num2;
            num1= num2;
            num2 = newnum;
            System.out.println(newnum);
        }
    }
}
