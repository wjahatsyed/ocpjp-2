package com.wjahatsyed.ocp.chapter_two.i_a_s_v_o_an_overridden_method.example_2;

/**
 * Created by Syed Wajahat on 10/9/2020.
 */
public interface MyInterface {
    public default void addNumber(int a, int b) {
        System.out.println(a + b);
        System.out.println("I am a default method in interface");
    }
}
