package com.wjahatsyed.ocp.chapter_two.overriding_n_rt_n_cr.returning_a_value;

/**
 * Created by Syed Wajahat on 10/19/2020.
 * Following are the 6 rules we need to know related to returning a value from a method
 */
public class Class {
    public Button doStuff() {
        /*
        Rule # 1
        It is totally fine for a method with a Class instance return type to return a null
         */
        return null;
    }

    public String[] go() {
        /*
        Rule # 2
        An array is a perfectly legal return type
         */
        return new String[]{"Wajahat", "Sara"};
    }

    public int foo() {
        /*
        Rule # 3
        In a method with primitive return type, you can return any value or variable that can be
        implicitly converted to the declared return type
         */
        char c = 'c';
        return c; //char is compatible with int
    }

    public int foo_2() {
        /*
        Rule # 4
        In a method with a primitive return type, you can return any value or variable that
        can be explicitly cast to the declared return type.
         */
        float f = 3.2f;
        return (int) f;
    }

    public void noReturn() {
        /*
        Rule # 5
        You must not return anything from a method with a void return type
         */
        return;
    }






}

class Button {

}
