package com.wjahatsyed.ocp.chapter_two.two_hundred;

/**
 * Created by Syed Wajahat on 10/11/2020.
 */
public class Horse extends Animal {
    @Override
    public void eat() {
        System.out.println("Horse eating hay");
    }

    public void eat(String s) {
        System.out.println("Horse eating " + s);
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Horse h = new Horse();
        h.eat();

        //Supertype reference and subtype
        Animal ah = new Horse();

        Horse he = new Horse();
        he.eat("Apples");

        //Compiler error in the following two cases
        Animal animal = new Animal();
        //because animal class doest not have a method is String parameter
        //animal.eat("Cakse");

        Animal animal_2 = new Horse();
        //This would not compile as well as the reference shall decide which
        //method shall be invoked
        //animal_2.eat("Cakes");
    }
}
