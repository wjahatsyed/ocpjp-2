package com.wjahatsyed.ocp.chapter_one.random_2;

/**
 * Created by Syed Wajahat on 9/24/2020.
 * Abstract methods can only exist in a
 */
public class MyClass_2 {
    final MyClass_1 myClass_1 = new MyClass_1();

    public MyClass_2() {
        myClass_1.setName("Wajahat");
        myClass_1.setAge(31);
    }

    public static void main(String[] args) {
        MyClass_2 myClass_2 = new MyClass_2();
        System.out.println(myClass_2.myClass_1);
    }
}
