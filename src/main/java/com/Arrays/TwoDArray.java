package com.Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and Columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        System.out.println("Enter the inputs of rows and columns");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
