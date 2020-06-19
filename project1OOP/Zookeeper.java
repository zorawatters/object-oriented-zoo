import java.util.List;

public class Zookeeper {
    public static void main(String[] args) {
        //creating instances
        Zoo zoo = new Zoo();
        Animal cat1 = new Cat("Carla", "cat");
        Animal lion1 = new Lion("Leonard", "lion");
        Animal tiger1 = new Tiger("Tammy", "tiger");
        Animal dog1 = new Dog("Darius", "dog");
        Animal wolf1 = new Wolf("Wendy", "wolf");
        Animal hippo1 = new Hippo("Henry", "hippo");
        Animal rhino1 = new Rhino("Remy", "rhino");
        Animal elephant1 = new Elephant("Eloise", "elephant");
        Animal cat2 = new Cat("Charlie", "cat");
        Animal lion2 = new Lion("Leah", "lion");
        Animal tiger2 = new Tiger("Tyler", "tiger");
        Animal dog2 = new Dog("Darla", "dog");
        Animal wolf2 = new Wolf("Willis", "wolf");
        Animal hippo2 = new Hippo("Hillary", "hippo");
        Animal rhino2 = new Rhino("Rachel", "rhino");
        Animal elephant2 = new Elephant("Elbert", "elephant");
        
        //add animals to the zoo
        zoo.add(cat1);
        zoo.add(cat2);
        zoo.add(lion1);
        zoo.add(lion2);
        zoo.add(tiger1);
        zoo.add(tiger2);
        zoo.add(dog1);
        zoo.add(dog2);
        zoo.add(wolf1);
        zoo.add(wolf2);
        zoo.add(hippo1);
        zoo.add(hippo2);
        zoo.add(rhino1);
        zoo.add(rhino2);
        zoo.add(elephant1);
        zoo.add(elephant2);
        
        
        List<Animal> animals = zoo.getAnimals();
        //complete zookeeper actions
        wakeAnimals(animals);
        rollCallAnimals(animals);
        feedAnimals(animals);
        playAnimals(animals);
        shutdownAnimals(animals);        
    }
    //wake all animals
    public static void wakeAnimals(List<Animal> z) {
    	System.out.println("The zookeeper is waking the animals up!");
    	for(Animal a : z) {
    		a.wakeup();
    	}
    }
    //roll call all animals
    public static void rollCallAnimals(List<Animal> z) {
    	System.out.println("The zookeeper is giving a roll call!");
    	for(Animal a : z) {
    		a.makeNoise();
    	}
    }
    //feed all animals
    public static void feedAnimals(List<Animal> z) {
    	System.out.println("The zookeeper is feeding the animals!");
    	for(Animal a : z) {
    		a.eat();
    	}
    }
    //play with all animals
    public static void playAnimals(List<Animal> z) {
    	System.out.println("The zookeeper is playing with the animals!");
    	for(Animal a : z) {
    		a.roam();
    	}
    }
    //put all animals to sleep
    public static void shutdownAnimals(List<Animal> z) {
    	System.out.println("The zookeeper is putting the animals to sleep.");
    	for(Animal a : z) {
    		a.sleep();
    	}
    }
}