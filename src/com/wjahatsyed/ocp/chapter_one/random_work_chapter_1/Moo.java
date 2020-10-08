package com.wjahatsyed.ocp.chapter_one.random_work_chapter_1;

/**
 * Created by Syed Wajahat on 9/23/2020.
 */
public class Moo extends Zoo {
    public void useMyCoolMethod() {
        System.out.println("Moo says " + this.coolMethod());
        Zoo zoo = new Zoo();
        System.out.println("Zoo says " + zoo.coolMethod());
    }

    public static void main(String[] args) {
        Moo moo = new Moo();
        moo.useMyCoolMethod();
    }


}
