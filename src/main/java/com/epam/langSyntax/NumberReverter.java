package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        // 123
        int a = number / 100;        // hundreds place
        int b = (number % 100) / 10; // tens place
        int c = number % 10;         // units place

        int reversedNumber = c * 100 + b * 10 + a;
        System.out.println(reversedNumber);
    }

    public static void main(String[] args) {
        NumberReverter numberReverter = new NumberReverter();
        numberReverter.revert(123);
    }
}
