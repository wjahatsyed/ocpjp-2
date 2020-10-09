package com.wjahatsyed.ocp.chapter_two.i_a_s_v_o_an_overridden_method.example_2;

/**
 * Created by Syed Wajahat on 10/9/2020.
 * This shows how we can use super.someMethod to call default overridden method in the interface
 */
public class MyClass implements MyInterface {
    @Override
    public void addNumber(int a, int b) {
        MyInterface.super.addNumber(a, b);
        System.out.println("I just used super to call the overridden method");
    }

    public static void main(String[] args) {
        MyInterface ref1 = new MyClass();
        ref1.addNumber(25,20);
    }
}
