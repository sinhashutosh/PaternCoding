package org.example;

public class DecreasingTriangle {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row ; i++) {
            for (int j = i; j < row; j++) { // this loop must  start with i
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
