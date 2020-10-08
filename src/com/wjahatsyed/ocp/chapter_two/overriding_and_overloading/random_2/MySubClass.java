package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.random_2;

import java.io.FileNotFoundException;

/**
 * Created by Syed Wajahat on 10/8/2020.
 * A checked exception if defined in the overridden method, in the overriding method
 * shall be same or subclass of the exception in the overridden method.
 *
 */
public class MySubClass extends MySuperClass {
    @Override
    public void myMethod() throws FileNotFoundException{

    }
}
