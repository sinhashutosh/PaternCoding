package org.example;

public class RightSidedTriangle {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = i; j < row; j++) {//this loop print space in decreasing manner
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {//this loop  print * in increrasing manner
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
