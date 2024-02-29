package com.epam.conditions;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        System.out.println("Before swapping: first = " + first + ", second = " + second);

        // XOR swap algorithm
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping: first = " + first + ", second = " + second);
    }

    public static void main(String[] args) {
        BitwiseValuesSwap bitwiseSwap = new BitwiseValuesSwap();
        bitwiseSwap.swap(5, 10);
    }
}
