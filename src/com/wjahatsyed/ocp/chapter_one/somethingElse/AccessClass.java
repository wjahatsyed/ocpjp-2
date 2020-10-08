package com.wjahatsyed.ocp.chapter_one.somethingElse;

import com.wjahatsyed.ocp.chapter_one.certification.OtherClass;

/**
 * Created by Syed Wajahat on 7/14/2020.
 */
public class AccessClass {
    static public void main(String[] args) {
        OtherClass otherClass = new OtherClass();
        /*
        My method has default access so it cannot be accessed outside the package.
         */
        //otherClass.myMethod();
    }
}
