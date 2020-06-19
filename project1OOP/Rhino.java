public class Rhino extends Pachyderm {
    public Rhino(String name, String type) {
        super(name, type);
    }

    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " is making a trumpet noise! So cute!");
    }

    public void roam() {
            System.out.println(this.name + " the " + this.type + " is sniffing around!");
    }
}