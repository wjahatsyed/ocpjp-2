package com.wjahatsyed.ocp.chapter_two.hasA.random_1;

/**
 * Created by Syed Wajahat on 10/2/2020.
 */
public class Horse extends Animal {
    private Halter halter = new Halter();

    public void tie(LeadRope rope) {
        //Delegate the behavior to the Halter object
        halter.tie(rope);
    }
}
