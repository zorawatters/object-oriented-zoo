//Write a simple OO program in Java 8 or later that implements a Zoo full of Animals. The Animals in
//        your Zoo are represented on slide 16 of Lecture 5. Create a class structure similar to slide 17 with at
//        least three levels of inheritance (e.g. Animal, Feline, Cat). You may decide how many of each animal live
//        in your zoo, but there should be at least two instances of each subclass (like Cat). Individual animals
//        should have individual names for their instances that start with the same letter of their subclass (e.g.
//        Charlie and Chloe for Cat).
//        You will also need a class for a Zookeeper. The Zookeeper will have the following responsibilities â€“ wake
//        the animals, roll call the animals, feed the animals, exercise the animals, shut down the zoo. Each
//        animal will have a method that responds to this (wakeup, make noise, eat, roam, sleep). You can decide
//        when itâ€™s appropriate to use a method at a superclass or subclass level for each animalâ€™s behavior, but
//        there should be some behaviors that are placed at each of the three inheritance levels. In at least one
//        case (probably for the Cats) use a random number generation to select from alternative responses to
//        animal actions (e.g. when you ask a cat to sleep, it may randomly sleep, hiss, or run around).
//        When the program runs, the Zookeeper should execute each of his responsibilities in order (display a
//        string for each action he executes), and the animals should respond by displaying strings with their
//        name, their type, and their response to the Zookeeper. It is likely you will have a main program that
//        instantiates the objects before they begin to act. Your program should demonstrate polymorphism by
//        asking your collection of animals to perform their tasks by referring to a collection of all animals at the
//        Zoo when executing methods. Capture the text output of the final program in an out file called
//        â€œdayatthezoo.outâ€�. Your submission must include your Java code, a README (described below), and
//        this out file.

import java.util.*;

public class Zoo {

    private List<Animal> animals;

    public Zoo() { // constructor
    	animals = new ArrayList<Animal>();
    }

    public void add(Animal newAnimal) {
        animals.add(newAnimal);
    }
    
    public List<Animal> getAnimals(){
    	return animals;
    }
}