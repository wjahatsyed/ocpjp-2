package com.wjahatsyed.ocp.chapter_two.random_1;

/**
 * Created by Syed Wajahat on 9/30/2020.
 */
public class Foo {
    public int left = 9;
    public int right = 9;

    public void setLeft(int leftNum) {
        left = leftNum;
        right = leftNum / 3;
    }
}
