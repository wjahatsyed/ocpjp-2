package com.wjahatsyed.ocp.chapter_one.random_4.package_1;

/**
 * Created by Syed Wajahat on 9/28/2020.
 * Example of enums with instance variables
 */
public enum CoffeeSize {
    BIG(6), HUGE(10), OVERWHELMING(16);
    private int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return this.ounces;
    }
}
