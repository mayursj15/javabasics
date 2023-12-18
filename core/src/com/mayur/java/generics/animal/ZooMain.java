package com.mayur.java.generics.animal;

public class ZooMain {
    public static void main(String[] args) {
        Cage cage = new Cage();
        cage.setAnimal1(new Monkey());
        cage.setAnimal1(new Lion());
        // cage.setAnimal1(new Car());  // its not allowed as we are saying cage object should extends
        // Animal Here Lion and Money extends Animal but car does not hence its giving compile time error.
    }
}
