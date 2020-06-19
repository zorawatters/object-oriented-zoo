import java.util.Random;

public class Lion extends Feline {
    public Lion(String name, String type) {
        super(name, type);
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is roaring!");
    }

    public void roam() {
        System.out.println(this.name + " the " + this.type + " is prowling!");
    }

    public void eat() {
        //smaller chance of eating the zookeeper than just eating
    	Random rand = new Random();
        int wildCard = rand.nextInt(10);
        if(wildCard % 3 == 0) {
            System.out.println(this.name + " the " + this.type + " tried to eat the Zookeeper!");
        }
        else {
            System.out.println(this.name + " the " + this.type + " is eating!");
        }

    }
}