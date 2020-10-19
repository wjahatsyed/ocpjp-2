package com.wjahatsyed.ocp.chapter_two.overriding_n_rt_n_cr.returning_a_value.rule_6_example_2;

/**
 * Created by Syed Wajahat on 10/19/2020.
 * In a method with an object reference return type, you can return any object type that
 * can be implicitly cast to the declared return type.
 */
public class TestChewable {
    //Method with an interface return type
    public Chewable getChewable() {
        return new Gum();
    }
}


/*
instanceof returns true if a instance b, a is an instance of b, a is an instance of a subtype of b
or a is an instance of a class that implements the B interface
 */