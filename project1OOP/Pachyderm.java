public class Pachyderm extends Animal {
    public Pachyderm(String name, String type) {
        super(name, type);
    }
    //pachyderms stomp
    public void roam() {
        System.out.println(this.name + " the " + this.type + " is stomping around!");
    }
}