package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.overloading_methods.one_nine_seven;

/**
 * Created by Syed Wajahat on 10/9/2020.
 */
public class Animal {

}

class Horse extends Animal {

}

class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("In the Animal version");
    }

    public void doStuff(Horse h) {
        System.out.println("In the Horse version");
    }

    public static void main(String[] args) {
        UseAnimals a = new UseAnimals();
        a.doStuff(new Animal());
        a.doStuff(new Horse());

        /*
        That's fine as Animal one goes to the animal method and horse one goes to the horse argument overloaded version
        But what if we use Animal reference and horse object?
         */
        Animal animalRefToHorse = new Horse();
        //This will use doStuff method with Animal a as an argument because as we know subtypes can be passed to supertype parameter as argument
        a.doStuff(animalRefToHorse);


    }
}

