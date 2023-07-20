package OOPs;

import OOPs.Inheritance.Animal;
import OOPs.Inheritance.Dog;
import OOPs.Inheritance.Fish;

public class main {
    public static void main(String[] args) {
       Dog Roxy = new Dog("GermanShepard", 50);
       doAnimalStuff(Roxy, "fast");
       Dog yorkie = new Dog("yorkie", 20, "lofted", "round");
       doAnimalStuff(yorkie, "slow");

       Dog wolf = new Dog("wolf", 150);
       doAnimalStuff(wolf, "fast");

        Fish nimo = new Fish("golden fish", 0.25, 2, 3);
        doAnimalStuff(nimo, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("____________________________");
    }
}
