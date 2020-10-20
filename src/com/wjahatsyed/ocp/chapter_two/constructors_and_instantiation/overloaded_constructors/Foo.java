package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation.overloaded_constructors;

/**
 * Created by Syed Wajahat on 10/20/2020.
 */
public class Foo {
    Foo() {

    }

    Foo(String s) {
        //use this() or super()
        this();
    }

    Foo(int i, String s) {
        this(s);
    }
}
