package com.wjahatsyed.ocp.chapter_two.casting.upcasting;

/**
 * Created by Syed Wajahat on 10/13/2020.
 */
public class Animal {

}

class Dog extends Animal {

}

class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        //Implicit up casting
        Animal a1 = d;
        //Explicit - optional
        Animal a2 = (Animal) d;
    }
}
