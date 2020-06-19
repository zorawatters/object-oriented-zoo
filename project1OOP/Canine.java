public class Canine extends Animal {
    public Canine(String name, String type) {
        super(name, type);
    }
    //canines wakeup differently
    public void wakeup() {
        System.out.println(this.name + " the " + this.type + " is stretching as it wakes up!");
    }
}