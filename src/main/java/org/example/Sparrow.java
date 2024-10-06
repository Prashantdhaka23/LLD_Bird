package org.example;

public class Sparrow extends Bird  implements FlyingBird{

    FlyingBehaviour fb;

    public Sparrow(String species, String colour, int weight, double wingSpan, FlyingBehaviour fb) {
        super(species, colour, weight, wingSpan);
        this.fb = fb;
    }

    @java.lang.Override
    public String eat() {
        System.out.println("Eat like Sparrow");
        return "Eat like Sparrow";
    }

    @java.lang.Override
    public String fly() {
        String Result = fb.makeFly();
        return Result;
    }
    @java.lang.Override
    public String makeSound() {
        System.out.println("Sound like Sparrow");
        return "Sound like Sparrow";
    }
}
