package com.wjahatsyed.ocp.chapter_one;

/**
 * Created by Syed Wajahat on 7/13/2020.
 * In an interface, everything is public
 * An interface static method can only be invoked thru the Interface name
 */
public interface MyInterface_2 {
    public static void myStaticMethod() {
        System.out.println("Hello. I am a static method. I cannot be overridden");
    }

   /* public final default void myDefaultMethod(){

    }*/
    //above method cannot compile as default methods cannot be final
    //A default method cannot be static
}
