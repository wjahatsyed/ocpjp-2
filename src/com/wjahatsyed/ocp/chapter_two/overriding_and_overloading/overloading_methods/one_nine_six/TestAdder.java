package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.overloading_methods.one_nine_six;

/**
 * Created by Syed Wajahat on 10/9/2020.
 */
public class TestAdder {
    public static void main(String[] args) {
        Adder a = new Adder();
        int b = 27;
        int c = 3;
        int result = a.addThem(b, c);
        double doubleResult = a.addThem(22.5, 9.3);

        System.out.println(result);
        System.out.println(doubleResult);
    }
}
