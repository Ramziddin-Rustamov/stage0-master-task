package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength <= 0) {
            System.out.println("Please enter a positive integer for cathetus length.");
            return;
        }

        System.out.println("Pyramid with cathetus length " + cathetusLength + ":");

        for (int i = 1; i <= cathetusLength; i++) {
            // Print each number for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print the reverse order of numbers for the current row
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }


    public static void main(String[] args) {

        new Pyramid().printPyramid(7);
    }

}
