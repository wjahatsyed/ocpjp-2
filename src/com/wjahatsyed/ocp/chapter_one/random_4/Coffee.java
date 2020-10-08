package com.wjahatsyed.ocp.chapter_one.random_4;

/**
 * Created by Syed Wajahat on 9/28/2020.
 */
public class Coffee {
    CoffeeSize coffeeSize;

    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.coffeeSize = CoffeeSize.BIG;
    }
}

enum NewCoffeeSize{
    MEDIUM, LARGE, XLARGE
}
