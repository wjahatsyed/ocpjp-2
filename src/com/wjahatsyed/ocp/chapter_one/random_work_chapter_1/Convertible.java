package com.wjahatsyed.ocp.chapter_one.random_work_chapter_1;

/**
 * Created by Syed Wajahat on 9/23/2020.
 */
public class Convertible extends SportsCar {
    void doThing(){
        SportsCar sportsCar = new SportsCar();
        //Invoking a method using reference of the class
        sportsCar.goFast();
    }

    void doMore(){
        //Invoking an inherited method
        goFast();
    }
}
