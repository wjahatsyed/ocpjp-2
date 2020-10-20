package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation;

/**
 * Created by Syed Wajahat on 10/20/2020.
 */
public class Animal {
    Animal(String name) {
        super();
    }
}

class Horse extends Animal {
    Horse() {
        super("Horshey");
    }
}
