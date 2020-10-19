package com.wjahatsyed.ocp.chapter_two.implementing_interfaces.two_two_one;

/**
 * Created by Syed Wajahat on 10/16/2020.
 * If a class implements two interfaces and both the interfaces have duplicate default methods
 * then the compiler shall be confused which method to call so the compiler raises this problem
 * and then we need to override this method in the concrete class
 */
public class MultiInt implements I1, I2{
    @Override
    public int doStuff() {
        return 0;
    }
}
