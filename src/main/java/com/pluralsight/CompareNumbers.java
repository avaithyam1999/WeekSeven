package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        isEven(6);
        isPositive(-10);
    }
    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static void isPositive(double number) {
        if (number > 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
