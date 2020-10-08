package com.wjahatsyed.ocp.chapter_one;

/**
 * Created by Syed Wajahat on 7/13/2020.
 * An example of class implementing an interface which has a default method
 */
public class MyClass implements MyInterface {
    public void myFinalDefaultMethod() {
        System.out.println("Wajahat");
    }

    public static void main(String[] args) {
        MyInterface myInterface = new MyClass();
        myInterface.myFinalDefaultMethod();
        //calling static method
        MyInterface_2.myStaticMethod();
    }
}
