package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_1;

/**
 * Created by Syed Wajahat on 10/7/2020.
 * The reference shall decide what methods of a class are available to be invoked
 * <p>
 * To reiterate, the compiler looks only at the reference type, not the instance
 * type.
 */
public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();

        a.eat();
        b.eat();

        //This function buck can only be called using the horse reference
        Horse horse = new Horse();
        horse.buck();
    }
}
