package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_3;

/**
 * Created by Syed Wajahat on 10/8/2020.
 */
public class MySubClass extends MyAbstractClass implements MyInterface {
    /*
    We do not need to override the abstract method myMethod()
    because we have a static method in MyInterface with the same name.
    The static cannot be overridden which is true and in this, it doesn't get overridden
    but overrides the abstract myMethod() of the MyAbstractClass
     */

    public static void main(String[] args) {
        MyAbstractClass myAbstractClass = new MySubClass();
        myAbstractClass.myMethod();
        myAbstractClass.myMethod();

        MySubClass mySubClass = new MySubClass();
        mySubClass.myNewMethod();
    }

    public void myMethod() {
        System.out.println("Helloo");
    }
}
