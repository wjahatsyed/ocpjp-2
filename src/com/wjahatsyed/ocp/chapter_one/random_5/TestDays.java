package com.wjahatsyed.ocp.chapter_one.random_5;

/**
 * Created by Syed Wajahat on 9/29/2020.
 */
public class TestDays {
    public enum Days {
        MON, TUE, WED
    }

    ;

    public static void main(String[] args) {
        for (Days d : Days.values())
            ;
        Days[] d2 = Days.values();
        System.out.println(d2[2]);
    }
}
