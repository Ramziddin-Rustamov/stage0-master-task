package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {
    Scanner scanner = new Scanner(System.in);
    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Multiplication Table for " + numberTableToPrint + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberTableToPrint + " x " + i + " = " + (numberTableToPrint * i));
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int inputNumber = scanner.nextInt();

        multiplicationTable.printTable(inputNumber);

        scanner.close();
    }

}
