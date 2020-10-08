package com.wjahatsyed.ocp.chapter_one.random_4.package_1;

/**
 * Created by Syed Wajahat on 9/28/2020.
 */
public class MyClass {
    CoffeeSize coffeeSize;

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.coffeeSize = CoffeeSize.BIG;

        System.out.println(myClass.coffeeSize.getOunces());

        for (CoffeeSize cz : CoffeeSize.values()) {
            System.out.print(cz.ordinal());
            System.out.print(" ");
            System.out.print(cz + " " + cz.getOunces());
            System.out.println();
        }
    }
}
