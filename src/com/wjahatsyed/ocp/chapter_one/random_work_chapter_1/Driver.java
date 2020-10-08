package com.wjahatsyed.ocp.chapter_one.random_work_chapter_1;

/**
 * Created by Syed Wajahat on 9/23/2020.
 * To access methods of a class, it is necessary to have that class visible
 * i.e. that class should be in the same package or must be declared public.
 *
 */
public class Driver {
    void doDriverStuff() {
        SportsCar sportsCar = new SportsCar();
        //Invoking a method using reference of the class
        sportsCar.goFast();

        Convertible convertible = new Convertible();
        //Invoking a method using reference of the class
        convertible.goFast();
    }
}
