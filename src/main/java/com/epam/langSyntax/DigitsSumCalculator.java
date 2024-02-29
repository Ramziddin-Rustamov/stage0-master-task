package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        //        1234
        int a = number / 1000; // thousands place
        int b = (number % 1000) / 100; // hundreds place
        int c = (number % 100) / 10;   // tens place
        int d = number % 10;          // units place

        int sum = a + b + c + d;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(1234);
    }
}
