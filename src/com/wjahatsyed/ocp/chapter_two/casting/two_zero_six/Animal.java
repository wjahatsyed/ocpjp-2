package com.wjahatsyed.ocp.chapter_two.casting.two_zero_six;

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
        /*
        This throws ClassCastException due to the fact that we have an animal object in memory
        and we are referring by down casting it to one of it's subtypes which is not possible.
        As per the rule, an object in memory can be accessible by a reference of the same type,
        a reference of a parent/super type or by a reference of an interface that is implemented by the
        class.
         */
        Dog d = (Dog) animal;

        //The following does not compile
        //String s = (String) animal;

    }
}
