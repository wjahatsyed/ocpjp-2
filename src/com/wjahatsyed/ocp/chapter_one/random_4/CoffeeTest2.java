package com.wjahatsyed.ocp.chapter_one.random_4;

/**
 * Created by Syed Wajahat on 9/28/2020.
 */
class Coffee2 {
    enum CoffeeSize {
        BIG, HUGE, OVERWHLEMING
    }

    CoffeeSize size;

}

public class CoffeeTest2 {
    public static void main(String[] args) {
        Coffee2 drink = new Coffee2();
        drink.size = Coffee2.CoffeeSize.BIG;
    }
}
