package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.overloading_methods.one_nine_six;

/**
 * Created by Syed Wajahat on 10/9/2020.
 */
public class Adder {
    public int addThem(int x, int y) {
        return x + y;
    }

    //overload the addThem method to add doubles instead of ints
    public double addThem(double x, double y) {
        return x + y;
    }


}
