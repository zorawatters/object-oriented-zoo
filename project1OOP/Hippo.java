public class Hippo extends Pachyderm {
    public Hippo(String name, String type) {
        super(name, type);
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is honking!");
    }
}