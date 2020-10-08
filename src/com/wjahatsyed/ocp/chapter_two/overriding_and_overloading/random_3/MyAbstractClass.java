package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_3;

/**
 * Created by Syed Wajahat on 10/8/2020.
 */
public abstract class MyAbstractClass {
    public abstract void myMethod();

    public void myNewMethod() {
        System.out.println("Hi!");
    }
}
