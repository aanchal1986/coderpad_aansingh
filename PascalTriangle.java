package com.capg.coderpad.programs;

import java.util.Scanner;

public class PascalTriangle {

    public static void displayPascalTriangle(int n) {
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0)
                    c[i][j] = 1;
                else if (i == j)
                    c[i][j] = 1;
                else
                    c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                System.out.print(c[i][j]);
            }
            System.out.println("");

        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and cols");
        int n = sc.nextInt();
        displayPascalTriangle(n);

    }
}


