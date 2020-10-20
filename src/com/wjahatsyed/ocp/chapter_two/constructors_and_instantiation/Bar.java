package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation;

/**
 * Created by Syed Wajahat on 10/20/2020.
 */
public class Bar {
    void takeInt(int x) {
        System.out.println(x);
    }
}

class UseBar {
    public static void main(String[] args) {
        Bar b = new Bar();
        b.takeInt(5);
    }
}
