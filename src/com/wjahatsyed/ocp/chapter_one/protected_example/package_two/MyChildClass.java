package com.wjahatsyed.ocp.chapter_one.protected_example.package_two;

import com.wjahatsyed.ocp.chapter_one.protected_example.package_one.MyParentClass;

/**
 * Created by Syed Wajahat on 7/14/2020.
 */
public class MyChildClass extends MyParentClass {
    public static void main(String[] args){
        MyParentClass myParentClass = new MyParentClass();
        /*
        A protected member is only accessible outside the package thru inheritance not thru reference.
         */
        //myParentClass.x;
    }

    public void myMethod(){
        //accessing protected member thru inheritance
        //This x is not accessible by any of the sub classes of the MyChildClass
        System.out.println(x);
    }
}
