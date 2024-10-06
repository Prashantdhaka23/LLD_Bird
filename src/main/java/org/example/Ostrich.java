package org.example;

public class Ostrich extends Bird{

    public Ostrich(String species, String colour, int weight, double wingSpan) {
        super(species, colour, weight, wingSpan);
    }

    @java.lang.Override
    public String makeSound() {
        System.out.println("Sound like Ostrich");
        return "Sound like Ostrich";
    }

    @java.lang.Override
    public String eat() {
        System.out.println("Eat like Ostrich");
        return "Eat like Ostrich";
    }


}
