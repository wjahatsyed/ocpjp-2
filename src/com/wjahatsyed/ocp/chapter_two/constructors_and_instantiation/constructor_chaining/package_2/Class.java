package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation.constructor_chaining.package_2;

/**
 * Created by Syed Wajahat on 10/20/2020.
 * An example of this() calling the overloaded constructor
 * We can replace this() in the overloading method by super() and in that case,
 * it will directly call the constructor of the parent class instead of the overloaded constructor of the class.
 */
public class Class {
    //default no-arg constructor
    public Class() {
        System.out.println("I am the overloaded default no-arg constructor");
    }

    public Class(String name) {
        //super();
        this();
        System.out.println("I am overloading the default constructor and I am paremeterized");
    }

    public static void main(String[] args){
        Class object_1 = new Class("Wajahat");

    }
}
