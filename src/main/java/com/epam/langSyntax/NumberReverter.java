package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        // 123
        int a  = number / 100 ; // 123 / 1
        int b = (number % 100) / 10 ; // 2
        int c = number % 10; // 3
        int reversedNumber = c * 100 + b * 10 + a;
        System.out.println(reversedNumber);
    }

    public static void main(String[] args) {
        NumberReverter numberReverter = new NumberReverter();
        numberReverter.revert(123);
    }

}
