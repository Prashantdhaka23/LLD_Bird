package org.example;

public class Penguin extends Bird{

    public Penguin(String species, String colour, int weight, double wingSpan) {
        super(species, colour, weight, wingSpan);
    }

    @java.lang.Override
    public String eat() {
        System.out.println("Eat like Penguin");
        return "Eat like Penguin";
    }

    @java.lang.Override
    public String makeSound() {
       System.out.println("Sound like Penguin");
       return "Sound like Penguin";
    }

}
