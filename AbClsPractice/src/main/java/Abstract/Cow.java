package Abstract;

import Abstract.Animal;

public class Cow extends Animal {
    @Override
    void walk() {
        System.out.println("Cows can walk...");
    }

    @Override
    void sound() {
        System.out.println("Cows can make sound...");
    }
}
