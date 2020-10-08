package com.wjahatsyed.ocp.chapter_one.certification;

/**
 * Created by Syed Wajahat on 7/16/2020.
 * A default member is only available within the same package. It is not even
 * available by inheritance if the parent class is in a different package.
 */
public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.testIt();
    }

    public void testIt() {
        System.out.println(x);
    }
}
