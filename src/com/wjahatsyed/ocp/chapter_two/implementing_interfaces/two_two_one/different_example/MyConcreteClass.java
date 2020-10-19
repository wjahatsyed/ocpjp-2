package com.wjahatsyed.ocp.chapter_two.implementing_interfaces.two_two_one.different_example;

/**
 * Created by Syed Wajahat on 10/16/2020.
 * The interface method is overridden in the abstract class as they both have the same
 * name - the default method gets overridden in the abstract class (doStuff)
 */
public class MyConcreteClass extends AbstractClass implements Interface {
    public static void main(String[] args) {
        /*
        An object in memory can be accessed by a reference of the same type,
        a reference of a parent type or a reference of an interface that is implemented
        by class of that object
         */

        AbstractClass object1 = new MyConcreteClass();
        int a = object1.doStuff();

        MyConcreteClass object2 = new MyConcreteClass();
        int b = object2.doStuff();

        Interface object3 = new MyConcreteClass();
        int c = object3.doStuff();

        //All of the above methods shall return the same overriding output.
        System.out.println(a + " " + b + " " + "" + c);

    }
}
