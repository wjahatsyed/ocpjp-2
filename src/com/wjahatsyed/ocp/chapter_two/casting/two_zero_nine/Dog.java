package com.wjahatsyed.ocp.chapter_two.casting.two_zero_nine;

/**
 * Created by Syed Wajahat on 10/13/2020.
 */
public abstract class Dog implements Pet {
    @Override
    public void petMethod() {
        System.out.println("I am overridden in Dog class");
    }
}
