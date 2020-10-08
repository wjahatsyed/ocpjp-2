package com.wjahatsyed.ocp.chapter_one.association.composition;

/**
 * Created by Syed Wajahat on 9/16/2020.
 * A car has an engine but engine cannot exist separately as it is useless.
 * Therefore, we initialize the engine object inside the constructor of the Car class.
 * Once the object of Car is destroyed, Engine object is also destroyed.
 */
public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }
}
