package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_1;

/**
 * Created by Syed Wajahat on 10/7/2020.
 */
public class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eating hay, oats" +
                "and horse treats");
    }

    public void buck() {
        //some code here
        System.out.println("This is a buck method");
    }
}
