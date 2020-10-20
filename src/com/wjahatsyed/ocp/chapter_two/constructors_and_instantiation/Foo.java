package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation;

/**
 * Created by Syed Wajahat on 10/20/2020.
 * In this example, we have explicitly added a paremeterized constructor so
 * the compile won't add a no-arg constructor at compile time.
 * we can overload constructors and have many constructors of a class.
 */
public class Foo {
    int size;
    String name;

    Foo(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public static void main(String[] args){
        Foo f = new Foo("Wajahat", 32);

    }


}
