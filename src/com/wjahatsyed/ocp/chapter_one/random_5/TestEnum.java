package com.wjahatsyed.ocp.chapter_one.random_5;

/**
 * Created by Syed Wajahat on 9/29/2020.
 */
public class TestEnum {
    static Animals a;

    public static void main(String[] args) {
        System.out.println(a.DOG.sound + "  " + a.FISH.sound);
    }
}

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animals(String s) {
        sound = s;
    }
}
