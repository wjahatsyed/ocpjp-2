package com.wjahatsyed.ocp.chapter_two.casting.two_zero_nine.package_1;

/**
 * Created by Syed Wajahat on 10/13/2020.
 */
public class Dog extends Animal {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.doDogStuff();

        Animal a2 = new Dog();
        ((Dog) a2).doDogStuff();
    }

    public void doDogStuff() {
        System.out.println("Halo. This is a dog reporting.");
    }
}

