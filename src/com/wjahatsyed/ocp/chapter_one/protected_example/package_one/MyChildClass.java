package com.wjahatsyed.ocp.chapter_one.protected_example.package_one;

/**
 * Created by Syed Wajahat on 7/14/2020.
 */
public class MyChildClass extends MyParentClass {
    public static void main(String[] args) {
        MyParentClass myParentClass = new MyParentClass();
        System.out.println(myParentClass.x);
    }
}
