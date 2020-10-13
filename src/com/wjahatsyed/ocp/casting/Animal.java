package com.wjahatsyed.ocp.casting;

/**
 * Created by Syed Wajahat on 10/13/2020.
 */
public class Animal {
    void makeNoise() {
        System.out.println("Generic noise");
    }
}

class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("bark");
    }

    void playDead() {
        System.out.println("roll over");
    }
}
