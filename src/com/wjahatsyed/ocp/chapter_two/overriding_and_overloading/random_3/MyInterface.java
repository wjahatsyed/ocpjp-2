package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_3;

/**
 * Created by Syed Wajahat on 10/8/2020.
 */
public interface MyInterface {
    public static void myMethod() {
        System.out.println("I am a static method in MyInterface");
    }

    public abstract void myNewMethod();


}
