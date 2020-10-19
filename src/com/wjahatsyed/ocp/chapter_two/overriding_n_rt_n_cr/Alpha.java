package com.wjahatsyed.ocp.chapter_two.overriding_n_rt_n_cr;

/**
 * Created by Syed Wajahat on 10/19/2020.
 * Using covariant as return types in overriding methods is allowed in Java 5.0 and above.
 */
public class Alpha {
    Alpha doStuff(char c) {
        return new Alpha();
    }
}
