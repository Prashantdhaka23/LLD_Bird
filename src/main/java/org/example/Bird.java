package org.example;

public  abstract class Bird {
    private String species;
    private String colour;
    private int weight;  // in grams
    private double wingSpan; // in cm
    public abstract String eat();
    public abstract String makeSound();


    public Bird(String species, String colour, int weight, double wingSpan) {
        this.species = species;
        this.colour = colour;
        this.weight = weight;
        this.wingSpan = wingSpan;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @java.lang.Override
    public String toString() {
        return "Bird{" +
                "species='" + species + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                ", wingSpan=" + wingSpan +
                '}';
    }
}

