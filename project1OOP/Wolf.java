public class Wolf extends Canine {
    public Wolf(String name, String type) {
        super(name, type);
    }

    public void eat() {
        System.out.println(this.name + " the " + this.type + " scarfing their food!");
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is barking!");
    }
}