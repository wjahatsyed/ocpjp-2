package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_1.random_2;

/**
 * Created by Syed Wajahat on 10/7/2020.
 * Remember that at runtime, Java uses virtual method invocation to dynamically
 * select the actual version of the method that will run.
 */
public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();

        a.eat();
        b.eat();
    }
}
