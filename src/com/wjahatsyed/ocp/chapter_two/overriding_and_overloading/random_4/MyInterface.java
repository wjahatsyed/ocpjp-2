package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_4;

/**
 * Created by Syed Wajahat on 10/8/2020.
 */
public interface MyInterface {
    public default void myMethod() {
        System.out.println("Default method in interface");
    }
}
