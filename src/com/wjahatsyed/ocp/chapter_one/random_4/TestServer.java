package com.wjahatsyed.ocp.chapter_one.random_4;

/**
 * Created by Syed Wajahat on 9/28/2020.
 */
public class TestServer {
    int count = 9;

    public void logIn() {
        int count = 10;
        System.out.println("local variable count is " + count);
    }

    public void count() {
        System.out.println("instance variable count is " + count);
    }

    public static void main(String[] args) {
        new TestServer().logIn();
        new TestServer().count();
    }
}
