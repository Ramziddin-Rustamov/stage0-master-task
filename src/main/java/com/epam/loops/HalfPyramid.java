package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength <= 0) {
            System.out.println("Please enter a positive integer for cathetus length.");
            return;
        }
        System.out.println("Half Pyramid with cathetus length " + cathetusLength + ":");
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
