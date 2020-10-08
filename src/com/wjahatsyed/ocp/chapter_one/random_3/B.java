package com.wjahatsyed.ocp.chapter_one.random_3;

/**
 * Created by Syed Wajahat on 9/25/2020.
 */
public class B extends A {
    void foo(int i) {
        System.out.println("just an overloaded method");
    }

    @Override
    public void foo() {
        System.out.println("Implementing method from abstract superclass");

    }

    /*
    A synchronized keyword ensures that the method is accessed by only one thread at a time
    A synchronized method can be of all the 4 access modifiers type 
     */
    public synchronized void mySyncMethod() {
        System.out.println("The Synchronized keyword can only be used with Methods.");
    }
}
