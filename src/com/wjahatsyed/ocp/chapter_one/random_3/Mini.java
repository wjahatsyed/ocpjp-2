package com.wjahatsyed.ocp.chapter_one.random_3;

/**
 * Created by Syed Wajahat on 9/25/2020.
 * An object in memory can be accessed by reference of the same type, reference of a parent class
 * or reference of an interface that is implemented by the class.
 */
public class Mini extends Car {

    @Override
    public void goUpHill(){
        System.out.println("Markhor! Pahar pe char.");
    }

    public static void main(String[] args){
        Mini vehicle = new Mini();
        //goUphill is typical example of virtual method invocation if reference is used of parant abstract class
        vehicle.goUpHill();
        vehicle.doCarThing();
        vehicle.getType();
    }

    public Mini(){
        super();
    }


}
