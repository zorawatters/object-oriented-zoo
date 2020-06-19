public class Tiger extends Feline {
    public Tiger(String name, String type) {
        super(name, type);
    }

    public void roam() {
        System.out.println(this.name + " the " + this.type + " is crouching!");
    }
}