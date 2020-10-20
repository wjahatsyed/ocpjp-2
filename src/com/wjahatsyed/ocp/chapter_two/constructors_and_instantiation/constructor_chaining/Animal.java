package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation.constructor_chaining;

/**
 * Created by Syed Wajahat on 10/20/2020.
 * main() calls new Horse().
 * Horse() calls super() of animal
 * Animal() calls super() of Object
 */
public class Animal {
    public Animal() {
        //super() has to be the first line in the constructor
        super();
        System.out.println("The Animal constructor is called");
    }
}

class Horse extends Animal {
    public Horse() {
        super();
        System.out.println("Horse constructor is called");
    }

    public static void main(String[] args) {
        Horse h = new Horse();


    }
}
