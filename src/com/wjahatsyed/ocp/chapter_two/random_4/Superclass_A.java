package com.wjahatsyed.ocp.chapter_two.random_4;

/**
 * Created by Syed Wajahat on 10/7/2020.
 */
public abstract class Superclass_A {
    public abstract void myAbstractMethod();

    public void myOtherMethod() {
        //This is a non abstract method
        System.out.println("I am in the SuperClass_A and it's an abstract superclass");
    }
}
