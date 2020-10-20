package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation.constructor_chaining.package_2;

/**
 * Created by Syed Wajahat on 10/20/2020.
 */
public class Animal {
    public static final String NAME = "Elanora";

    public Animal(String name) {
        System.out.println(name);
    }
}

class Cat extends Animal {
    public Cat() {
        super(Animal.NAME);

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println();
    }
}
