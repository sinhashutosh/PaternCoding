package org.example;

public class DecreasingRightTriangle {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < i; j++) {//this loop print space in decreasing manner
                System.out.print("  ");
            }
            for (int k = i; k <= row; k++) {//this loop  print * in increrasing manner
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
