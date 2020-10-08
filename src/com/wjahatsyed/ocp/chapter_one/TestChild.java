package com.wjahatsyed.ocp.chapter_one;

import com.wjahatsyed.ocp.chapter_one.random_work_chapter_1.other.Child;

/**
 * Created by Syed Wajahat on 9/23/2020.
 * Once a protected member is inherited by a subclass from the superclass, it becomes
 * private to any code outside that class whether in the same or different package
 * A local variable can only have one modifier, that is a non-access modifier final.
 */
public class TestChild {
    public static void main(String[] args){
        Child child = new Child();
        //System.out.println(child.x);

        //local variables cannot have any access modifiers
        final int x = 5;

    }
}
