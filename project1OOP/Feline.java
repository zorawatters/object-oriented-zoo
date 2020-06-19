public class Feline extends Animal {
    public Feline(String name, String type) {
        super(name, type);
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is purring!");
    }
}