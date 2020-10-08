package com.wjahatsyed.ocp.chapter_one.random_2;

/**
 * Created by Syed Wajahat on 9/24/2020.
 * An abstract method can only exist in an abstract class or an interface
 * A abstract class can have 0 or more abstract methods and can have non abstract methods as well
 * The first concrete class which extends the abstract class must provide implementation of the abstract methods of the abstract class
 * it is extending
 */
public abstract class MyAbstractClass {
    public void myNonAbstractMethod(){
        System.out.println("My non abstract method");
    }


}
