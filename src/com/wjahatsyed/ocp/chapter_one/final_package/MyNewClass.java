package com.wjahatsyed.ocp.chapter_one.final_package;

/**
 * Created by Syed Wajahat on 7/17/2020.
 */
public class MyNewClass {
    public void myMethod(int a, final int b){
        a =5;
        System.out.println(a+b);
        //The method argument b is final so a value cannot be reassigned to it.
        //b+=a;

    }
}
