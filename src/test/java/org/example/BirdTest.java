package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BirdTest {

    private Bird crow;
    private Bird sparrow;
    private Bird ostrich;
    private Bird pigeon;
    private Bird penguin;
    private Pigeon pigeonObj;
    private Crow crowObj;
    private Sparrow sparrowObj;

    @BeforeEach
    public void setUp() {
        // Initialize the bird objects before each test
        crow = new Crow("Crow", "Black", 205, 15, new FlyingBirdLikeCrowSparrow());
        sparrow = new Sparrow("Sparrow", "Red", 180, 9, new FlyingBirdLikeCrowSparrow());
        ostrich = new Ostrich("Ostrich", "Black and White", 450, 57);
        pigeon = new Pigeon("Pigeon", "Gray", 149, 17);
        penguin = new Penguin("Penguin", "White and Black", 304, 37);
        sparrowObj=new Sparrow("Sparrow", "Red", 180, 9, new FlyingBirdLikeCrowSparrow());
        crowObj= new Crow("Crow", "Black", 205, 15, new FlyingBirdLikeCrowSparrow());
        pigeonObj=new Pigeon("Pigeon", "Gray", 149, 17);
    }

    @Test
    public void testEat() {
        // Test eating behavior
        assertEquals("Eat like Crow", crow.eat());
        assertEquals("Eat like Sparrow", sparrow.eat());
        assertEquals("Eat like Ostrich", ostrich.eat());
        assertEquals("Eat like Pigeon", pigeon.eat());
        assertEquals("Eat like Penguin", penguin.eat());
    }
    @Test
    public void testMakeSound() {
        // Test sound making behavior
        assertEquals("Sound like Crow", crow.makeSound());
        assertEquals("Sound like Sparrow", sparrow.makeSound());
        assertEquals("Sound like Ostrich", ostrich.makeSound());
        assertEquals("Sound like Pigeon", pigeon.makeSound());
        assertEquals("Sound like Penguin", penguin.makeSound());
    }

    @Test
    public void testFlyForFlyingBirds() {
        // Test flying behavior for birds that can fly
        assertEquals("Flying like Crow/Sparrow", crowObj.fly());
        assertEquals("Flying like Crow/Sparrow", sparrowObj.fly());
        assertEquals("Fly like Pigeon", pigeonObj.fly());
        assertNotEquals("Flying like Crow", crowObj.fly());
        assertNotEquals("Flying like Sparrow", sparrowObj.fly());
    }

    @Test
    public void testToString() {
        // Test the toString() method for all birds
        assertEquals("Bird{species='Crow', colour='Black', weight=205, wingSpan=15.0}", crow.toString());
        assertEquals("Bird{species='Sparrow', colour='Red', weight=180, wingSpan=9.0}", sparrow.toString());
        assertEquals("Bird{species='Ostrich', colour='Black and White', weight=450, wingSpan=57.0}", ostrich.toString());
        assertEquals("Bird{species='Pigeon', colour='Gray', weight=149, wingSpan=17.0}", pigeon.toString());
        assertEquals("Bird{species='Penguin', colour='White and Black', weight=304, wingSpan=37.0}", penguin.toString());
    }
}
