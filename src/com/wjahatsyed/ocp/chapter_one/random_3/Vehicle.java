package com.wjahatsyed.ocp.chapter_one.random_3;

/**
 * Created by Syed Wajahat on 9/25/2020.
 * An abstract class does have a constructor however we cannot instantiate an abstract class
 * object but the constructor is used to initialize the instance variables of that abstract class
 */
public abstract class Vehicle {
    private String type;

    public abstract void goUpHill();

    public String getType() {
        return type;
    }

    public Vehicle() {
        System.out.println("The constructor of abstract class Vehcile is called");

    }
}
