package com.wjahatsyed.ocp.chapter_two.random_1;

/**
 * Created by Syed Wajahat on 10/2/2020.
 */
public class Test {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        if (!t1.equals(t2)) {
            System.out.println("they're not equal");
        }
        if (t1 instanceof Object) {
            System.out.println("t1's an object");
        }
    }
}
