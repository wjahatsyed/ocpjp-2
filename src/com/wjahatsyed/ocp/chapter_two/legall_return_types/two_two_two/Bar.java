package com.wjahatsyed.ocp.chapter_two.legall_return_types.two_two_two;

/**
 * Created by Syed Wajahat on 10/19/2020.
 * Since we are overloading the method "go" and we are changing the return type
 * then we must change the parameters of the method in order to shut the compiler up :P
 *
 */
public class Bar extends Foo {
    String go(int x) {
        return "I love you";
    }
}
