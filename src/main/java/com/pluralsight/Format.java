package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        formatName("Bob", "Smith");
        String firstName = "Ajith";
        String lastName = "Vaithyam";
        formatName(firstName, lastName);
        System.out.println(add(4,10));
    }
    public static void formatName(String firstName, String lastName) {
        System.out.println(lastName + ", " + firstName);
    }
    public static int add(int x, int y) {
        return x + y;
    }
}
