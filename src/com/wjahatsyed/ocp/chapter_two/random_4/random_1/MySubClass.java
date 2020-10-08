package com.wjahatsyed.ocp.chapter_two.random_4.random_1;

/**
 * Created by Syed Wajahat on 10/7/2020.
 */
public class MySubClass extends SuperClass implements MakkoInterface{
    public static void main(String[] args){
        MySubClass mySubClass = new MySubClass();
        mySubClass.myMethod1();

        //MakkoInterface.myMethod1();
    }

}
