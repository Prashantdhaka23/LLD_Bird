package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Staring the Bird LLD Testing");

        Bird crow= new Crow("Crow","Black",205,15 , new FlyingBirdLikeCrowSparrow());
        Bird sparrow= new Sparrow("Sparrow","Red",180,9 , new FlyingBirdLikeCrowSparrow());
        Bird ostrich = new Ostrich("Ostrich","Black and White" ,450 ,57);
        Bird pigeon = new Pigeon("Pigeon","Gray",149,17);
        Bird penguin = new Penguin("Penguin","White and Black",304,37);

        crow.eat();
        sparrow.eat();
        ostrich.eat();
        pigeon.eat();
        penguin.eat();

        crow.makeSound();
        sparrow.makeSound();
        ostrich.makeSound();
        pigeon.makeSound();
        penguin.makeSound();

        Crow c = new Crow("Crow","Black",205,15 , new FlyingBirdLikeCrowSparrow());
        Sparrow s= new Sparrow("Sparrow","Red",180,9 , new FlyingBirdLikeCrowSparrow());
        Pigeon pigeon_2 = new Pigeon("Pigeon","Gray",149,17);


        c.fly();
        s.fly();
        pigeon_2.fly();

        System.out.println(crow.toString());
        System.out.println(sparrow.toString());
        System.out.println(ostrich.toString());
        System.out.println(pigeon.toString());
        System.out.println(penguin.toString());

    }
}