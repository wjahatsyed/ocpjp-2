package com.wjahatsyed.ocp.chapter_two.overriding_n_rt_n_cr;

/**
 * Created by Syed Wajahat on 10/19/2020.
 */
public class Beta extends Alpha {
    @Override
    public Beta doStuff(char c) {
        return new Beta();
    }
}
