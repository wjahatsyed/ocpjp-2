package com.wjahatsyed.ocp.chapter_one;

/**
 * Created by Syed Wajahat on 9/22/2020.
 * A static method in interface cannot be final but it can be final in abstract classes or concrete classes
 */
public abstract class MyAbstractClass {

    /*
    abstract and static cannot work together in both abstract classes and interfaces
     */

    public final static void myStaticMethod(){
     System.out.println("My static method is working");
    }

    public static void main(String[] args){

    }
}
