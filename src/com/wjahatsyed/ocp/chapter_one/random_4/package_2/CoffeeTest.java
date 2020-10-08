package com.wjahatsyed.ocp.chapter_one.random_4.package_2;

/**
 * Created by Syed Wajahat on 9/28/2020.
 */
public class CoffeeTest {
    CoffeeSize coffeeSize;

    public static void main(String[] args) {
        CoffeeTest coffeeTest = new CoffeeTest();

        for (CoffeeSize cs : coffeeTest.coffeeSize.values()) {
            System.out.println(cs.getLidCode());
        }
    }

    public void myMethod(int... args){

    }
}
