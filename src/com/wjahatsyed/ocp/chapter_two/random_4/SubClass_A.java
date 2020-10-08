package com.wjahatsyed.ocp.chapter_two.random_4;

/**
 * Created by Syed Wajahat on 10/7/2020.
 * We cannot instantiate an abstract class or an interface but only a concrete class can
 * be used to create an object in memory (heap).
 */
public class SubClass_A extends Superclass_A implements MyInterface {
    public void myAbstractMethod() {
        System.out.println("Wajahat");
    }

    public static void main(String[] args) {
        //Perfect example of virtual method invocation
        SubClass_A subClass_a = new SubClass_A();
        subClass_a.myAbstractMethod();

        MyInterface myInterface = new SubClass_A();
        myInterface.myAbstractMethod();

        /*
        The above example works fine because myAbstractMethod is abstract in SuperClass_A.
        The myAbstractMethod() implementation in this Subclass_A fulfils the contract with both
        the abstract super class and the interface it is implementing.

        What if we have a method with same name in abstract superclass SuperClass_A and interface
        MyInterface but the method in abstract superclass is non-abstract??
        The code will still compile as the interface's contract for implementing the myOtherMethod() method
        shall be fulfilled by the superclass's non-abstract method myOtherMethod().
         */

        //calling the method using superclass reference
        subClass_a.myOtherMethod();

        //calling the method using interface reference
        myInterface.myOtherMethod();

    }
}
