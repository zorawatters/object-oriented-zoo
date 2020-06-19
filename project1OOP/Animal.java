
//import java.util;

public class Animal {
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

   //wakeup, make noise, eat, roam, sleep
    public void wakeup() {
        System.out.println(this.name + " the " + this.type + " has woken up!");
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is making noise!");
    }

    public void eat() {
        System.out.println(this.name + " the " + this.type + " is eating!");
    }

    public void roam() {
        System.out.println(this.name + " the " + this.type + " is roaming around!");
    }

    public void sleep() {
        System.out.println(this.name + " the " + this.type + " has gone to sleep!");
    }
}