package com.wjahatsyed.ocp.chapter_two.i_a_s_v_o_an_overridden_method;

/**
 * Created by Syed Wajahat on 10/9/2020.
 * This class gives you example how you can first run the code of
 * the overridden method then run the code of overriding code.
 * <p>
 * This also demonstrates partially the difference between super() and super.someMethod.
 * We use super() in the constructor to call the constructor of the parent class.
 *
 * The super keyword can only be used once.
 */
public class Animal {
    public Animal() {
        System.out.println("Parent constructor");
        System.out.println();
    }

    public void eat() {

    }

    public void printYourself() {
        System.out.println("Method in the superclass Animal");
        System.out.println();
    }
}

class Horse extends Animal {
    public Horse() {
        super();
        System.out.println("Subclass constructor");
        System.out.println();
    }

    @Override
    public void printYourself() {
        super.printYourself();
        System.out.println("Overriding the method");
    }

    public static void main(String[] args){
        Horse horse = new Horse();
        horse.printYourself();
    }
}
