package com.pluralsight;

public class MethodPractice {
    public static void main(String[] args) {
        sayHi("ajith", 1600);
        dance("Salsa");
        fish();
    }

    public static void sayHi(String firstName, int timeOfDay) {
        System.out.println("Hi " + firstName + ". The time is " + timeOfDay);
    }

    public static void dance(String typeOfDancing) {
//        System.out.println("Woahhohhh");
//        System.out.println("Stop! ");
//        System.out.println("Hammer Time");
        System.out.printf("I am %s dancing\n", typeOfDancing);
    }

    public static void fish() {
        System.out.println("Get out fishing rod");
        System.out.println("Hook the bait");
        System.out.println("Cast the reel");
        System.out.println("Wait until you feel a bite");
    }

}
