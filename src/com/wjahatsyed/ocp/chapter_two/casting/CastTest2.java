package com.wjahatsyed.ocp.chapter_two.casting;

/**
 * Created by Syed Wajahat on 10/13/2020.
 * As we all know, an array in Java can be of primitive data types, i.e.
 * bool, byte, short, int, long, float, double or char or any Object type (class)
 * <p>
 * instanceof operator returns true if a instanceof b, a is an instance of b or of a subclass of b
 * or b is an interface that is implemented by the class of a.
 */
public class CastTest2 {
    public static void main(String[] args) {
        Animal[] a = {
                new Animal(), new Dog(), new Animal()
        };

        for (Animal animal : a) {
            animal.makeNoise();
            if (animal instanceof Dog) {
                //We need typecasting here without casting, this would not compile
                //animal.playDead();

                //Let's cast the object - example of downcast
                ((Dog) animal).playDead();
            }
        }
    }
}
