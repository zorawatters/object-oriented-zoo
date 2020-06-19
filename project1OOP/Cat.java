import java.util.Random;
public class Cat extends Feline {
    public Cat(String name, String type) {
        super(name, type);
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is meowing!");
    }
    
    public void sleep() {
        Random rand = new Random();
        String sleep = this.name + " the " + this.type + " has gone to sleep!";
        String hiss = this.name + " the " + this.type + " is hissing at you!";
        String wild = this.name + " the " + this.type + " is jumping everywhere!";
        String cuddle = this.name + " the " + this.type + " is trying to cuddle!";
        
        //pick a random action for sleep
        String[] choices = {sleep, hiss, wild, cuddle};
        int randChoice = rand.nextInt(3);
        System.out.println(choices[randChoice]);
    }
}