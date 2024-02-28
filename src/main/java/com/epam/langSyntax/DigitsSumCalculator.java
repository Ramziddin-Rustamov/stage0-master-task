package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        //        1234
        int a  = number / 1000 ; //  / 1
        int b = (number % 1000) / 100 ; // 2
        int c = ( number % 100) / 10; // 3
        int d = number %10;

        int sum = a+b+c+d;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(1234);
    }

}
