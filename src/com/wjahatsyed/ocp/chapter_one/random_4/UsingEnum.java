package com.wjahatsyed.ocp.chapter_one.random_4;

/**
 * Created by Syed Wajahat on 9/28/2020.
 */
public class UsingEnum {
    public static void main(String[] args) {
        System.out.println(CoffeeSize.BIG);
        System.out.println(CoffeeSize.HUGE);
        System.out.println(CoffeeSize.OVERWHELIMING.x);

        for (CoffeeSize c : CoffeeSize.values()) {
            System.out.println(c.ordinal());
            System.out.println("Hello");
        }
    }
}
