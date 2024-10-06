package org.example;

public class Crow extends Bird implements FlyingBird{

    FlyingBehaviour fb;

    public Crow(String species, String colour, int weight, double wingSpan, FlyingBehaviour fb) {
        super(species, colour, weight, wingSpan);
        this.fb = fb;
    }

    @java.lang.Override
    public String makeSound() {
        System.out.println("Sound like Crow");
        return "Sound like Crow";
    }
    @java.lang.Override
    public String eat() {
        System.out.println("Eat like Crow");
        return "Eat like Crow";

    }
    @java.lang.Override
    public String fly() {
        String fly= fb.makeFly();
        return fly;
    }

}
