package com.wjahatsyed.ocp.chapter_one.random_5;

/**
 * Created by Syed Wajahat on 9/29/2020.
 */
public class Electronic implements Device {
    @Override
    public void doIt() {
    }
}

abstract class Phone1 extends Electronic {

}

abstract class Phone2 extends Electronic {
    public void doIt(int x) {

    }
}


interface Device {
    public void doIt();
}
