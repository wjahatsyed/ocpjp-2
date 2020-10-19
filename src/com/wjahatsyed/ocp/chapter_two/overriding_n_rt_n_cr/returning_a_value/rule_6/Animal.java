package com.wjahatsyed.ocp.chapter_two.overriding_n_rt_n_cr.returning_a_value.rule_6;

/**
 * Created by Syed Wajahat on 10/19/2020.
 * Rule # 6 related to return types:
 * In a method with an object reference return type, you can return any object type that can be
 * implicitly cast to the declared return type.
 */
public class Animal {
    public Animal getAnimal() {
        //Horse extends Animal so we can return Horse here.
        return new Horse();
    }

    public Object getObject() {
        int[] nums = {1, 2, 3};
        return nums;
    }
}

class Horse extends Animal {

}
