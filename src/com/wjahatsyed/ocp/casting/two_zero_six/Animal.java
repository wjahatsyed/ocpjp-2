package com.wjahatsyed.ocp.casting.two_zero_six;

/**
 * Created by Syed Wajahat on 10/13/2020.
 * Example of ClassCastException
 */
public class Animal {

}

class Dog extends Animal {

}

class DogTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //This compiles fine but can throw exception at Runtime
        Dog d = (Dog) animal;

    }
}
