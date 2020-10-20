package com.wjahatsyed.ocp.chapter_two.constructors_and_instantiation.overloaded_constructors;

/**
 * Created by Syed Wajahat on 10/20/2020.
 * As we know, in a this() or super(), we can only pass static members, i.e. methods or variables
 *
 * Key Rule: The first line in a constructor must be a call to super()or a
 * call to this(). but not both.
 *
 *
 */
public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    Animal() {
        this(makeRandomName());
    }

    static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        String name = new String[]{"Wajahat", "Sara", "Adil", "Nuzhat", "Mrs."}[x];
        return name;
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);
        Animal b = new Animal("Zeus");
        System.out.println(b.name);
    }
}
