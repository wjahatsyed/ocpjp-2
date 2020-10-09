package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.one_eight_nine_example;

/**
 * Created by Syed Wajahat on 10/9/2020.
 * @Override annotation was introduced in Java 5.
 */
public class Dog2 extends Animal {
    @Override
    public void eat() {
        System.out.println("No need to through exception here");
    }

    public static void main(String[] args) {
        Animal a = new Dog2();
        Dog2 d = new Dog2();
        d.eat();
        /*
        The above line is fine as we are using the dog reference to access the dog instance method
        which does not through any exception.
        But the line below does not compile as we are using the reference of a superclass.
        and in the subclass, whose object is actually created in memory has an instance method which is overriding the
        method but it does not clear the exception. It compile fines - Think about virtual method invocation in the below line.
        Since the reference is of the Superclass, first the compiler shall go to the superclass (obviously at compile) as overriding works
        at runtime so eventually and dynamically it will call the overriding method. But compiler is the boss!

         */
        //commenting the below line

        //a.eat();
    }
}
