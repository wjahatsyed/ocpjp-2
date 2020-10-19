package com.wjahatsyed.ocp.chapter_two.implementing_interfaces.two_two_one.package_2;

/**
 * Created by Syed Wajahat on 10/17/2020.
 */
public class MyClass implements Interface_1, Interface_2 {
    @Override
    public void myMethod() {
        System.out.println("I override both methods in Interface 1 and Interface 2");
    }

    public static void main(String[] args) {
        Interface_1 interface_1 = new MyClass();
        Interface_2 interface_2 = new MyClass();
        MyClass myClass = new MyClass();

        interface_1.myMethod();
        interface_2.myMethod();
        myClass.myMethod();
    }
}
