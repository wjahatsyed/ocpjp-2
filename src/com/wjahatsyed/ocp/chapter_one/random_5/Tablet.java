package com.wjahatsyed.ocp.chapter_one.random_5;

/**
 * Created by Syed Wajahat on 9/29/2020.
 */
public class Tablet extends Electronic1 implements Gadget {
    @Override
    public void doStuff() {
        System.out.println("show book");
    }
    public static void main(String[] args){
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}

interface Gadget {
    void doStuff();
}

abstract class Electronic1 {
    void getPower() {
        System.out.println("plug in");
    }
}


