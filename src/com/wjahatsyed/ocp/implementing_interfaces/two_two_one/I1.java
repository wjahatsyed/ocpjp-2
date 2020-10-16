package com.wjahatsyed.ocp.implementing_interfaces.two_two_one;

/**
 * Created by Syed Wajahat on 10/16/2020.
 */
public interface I1 {
    default int doStuff(){
        return 1;
    }


}

interface I2{
    default int doStuff(){
        return 2;
    }
}


