package com.wjahatsyed.ocp.chapter_one.random_work_chapter_1.other;

import com.wjahatsyed.ocp.chapter_one.random_work_chapter_1.certification.Parent;

/**
 * Created by Syed Wajahat on 9/23/2020.
 * A subclass can only access the protected member in the parent class through inheritance.
 * It cannot access a protected member of the parent class through reference of an object of the parent class
 */
public class Child extends Parent {
    public void testIt() {
        System.out.println("x is " + this.x);

        //Below code shows that we cannot access the x instance through parent class reference
        //Parent parent = new Parent();
        //System.out.println("x in parent is: " + parent.x);

        Child child = new Child();
        System.out.println(child.x);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.testIt();
    }
}
