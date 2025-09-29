package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        formatName("Bob", "Smith");
    }
    public static void formatName(String firstName, String lastName) {
        System.out.println(lastName + ", " + firstName);
    }
}
