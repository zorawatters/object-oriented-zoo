public class Dog extends Canine {
    public Dog(String name, String type) {
        super(name, type);
    }
    //dogs are happy
    public void roam() {
        System.out.println(this.name + " the " + this.type + " is running around and wagging their tail!");
    }
    //dogs bark
    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is barking!");
    }
}