package com.wjahatsyed.ocp.chapter_two.implementing_interfaces.two_two_one.different_example;

/**
 * Created by Syed Wajahat on 10/16/2020.
 */
public interface Interface {
    public default int doStuff() {
        return 1;
    }
}
