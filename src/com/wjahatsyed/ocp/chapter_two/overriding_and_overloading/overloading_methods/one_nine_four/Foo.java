package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.overloading_methods.one_nine_four;

import java.io.IOException;

/**
 * Created by Syed Wajahat on 10/9/2020.
 * Be sure to identify overloading and overriding methods
 */
public class Foo {
    public void doStuff(int y, String s) {
        //something
    }

    public void moreThings(int x) {

    }
}

class Bar extends Foo {
    public void doStuff(int y, long s) throws IOException {
        System.out.println("I am an overloaded method");
    }
}
