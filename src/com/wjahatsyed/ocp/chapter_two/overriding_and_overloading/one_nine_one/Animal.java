package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.one_nine_one;

/**
 * Created by Syed Wajahat on 10/9/2020.
 * The @Override annotation is a marker interface. It asks the compiler at compile
 * i.e. validates the overriding rules.
 * Of course, this annotation is optional.
 */
public class Animal {
    public void eat() {
        System.out.println("Generic animal eating generically");
    }
}

class Horse extends Animal {
    @Override
    public void eat() {
        System.out.println("Horse eating like a horse");
    }
}
