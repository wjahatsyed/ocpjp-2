package com.wjahatsyed.ocp.implementing_interfaces.two_one_five;

/**
 * Created by Syed Wajahat on 10/14/2020.
 */
public interface Bounceable extends Moveable, Spherical {
    void bounce();

    void setBounceFactor();
}
