import java.util.Random;

public class Elephant extends Pachyderm {
    public Elephant(String name, String type) {
        super(name, type);
    }

    public void eat() {
        System.out.println(this.name + " the " + this.type + " is slurping their food with their trunk!");
    }

    public void sleep() {
        //50/50 change of cuddling or sleeping
    	Random rand = new Random();
        int wildCard = rand.nextInt(10);
        if(wildCard % 2 == 0) {
            System.out.println(this.name + " the " + this.type + " tried to cuddle with the Zookeeper!");
        }
        else {
            System.out.println(this.name + " the " + this.type + " has fallen asleep!");
        }

    }
}