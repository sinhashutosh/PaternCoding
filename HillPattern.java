package org.example;

public class HillPattern {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int j = i; j < row; j++) {//loop to print space in decreasing order
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {//loop to print star in increasing order
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {//loop to print star in increasing order
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
