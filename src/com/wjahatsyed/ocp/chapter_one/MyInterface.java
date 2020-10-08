package com.wjahatsyed.ocp.chapter_one;

/**
 * Created by Syed Wajahat on 7/13/2020.
 * In interfaces, both static and default methods cannot be final.
 */
public interface MyInterface {
    default void myFinalDefaultMethod(){
        System.out.println("Ahmer");
    }

    static  void myMethod(){

    }

    default void myDefaultMethod(){

    }
}
