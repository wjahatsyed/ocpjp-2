package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.overloading_methods.one_nine_eight;

/**
 * Created by Syed Wajahat on 10/11/2020.
 */
public class DuoMain {
    public static void main(String[] args, int a) {
        System.out.println("I am overloaded so I won't be called");
    }

    public static void main(String[] args) {
        System.out.println("I am the one being called");
    }
}
