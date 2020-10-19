package com.wjahatsyed.ocp.chapter_two.overriding_n_rt_n_cr.returning_a_value.package_3;

/**
 * Created by Syed Wajahat on 10/19/2020.
 * Watch for methods that declare an abstract class or interface return type,
 * and know that any object that passes the IS-A test (in other words, would test true using the instanceof operator)
 * can be returned from that method.
 */
public abstract class Animal {

}

class Bear extends Animal {

}


class Test {
    public Animal go() {
        return new Bear(); //OK, Bear "is-a" Aninmal
    }
}