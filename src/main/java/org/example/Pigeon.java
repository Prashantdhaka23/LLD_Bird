package org.example;

public class Pigeon extends Bird{


    public Pigeon(String species, String colour, int weight, double wingSpan) {
        super(species, colour, weight, wingSpan);
    }
    @Override
    public String eat(){
        System.out.println("Eat like Pigeon");
        return "Eat like Pigeon";
    }

    @Override
    public String makeSound() {
        System.out.println("Sound like Pigeon");
        return "Sound like Pigeon";
    }

    public String fly(){

        System.out.println("Fly like Pigeon");
        return "Fly like Pigeon";
    }


}
