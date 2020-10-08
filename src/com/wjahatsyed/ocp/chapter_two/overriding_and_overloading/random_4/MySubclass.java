package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_4;

/**
 * Created by Syed Wajahat on 10/8/2020.
 */
public class MySubclass extends MyAbstractSuperClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Overriding in subclass");
    }

    public static void main(String[] args){
        MyInterface myInterface = new MySubclass();
        myInterface.myMethod();

        MyAbstractSuperClass myAbstractSuperClass = new MySubclass();
        myAbstractSuperClass.myMethod();
    }
}
