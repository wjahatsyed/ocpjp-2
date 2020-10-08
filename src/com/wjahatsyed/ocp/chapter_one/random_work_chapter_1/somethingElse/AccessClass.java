package com.wjahatsyed.ocp.chapter_one.random_work_chapter_1.somethingElse;

import com.wjahatsyed.ocp.chapter_one.random_work_chapter_1.certification.OtherClass;

/**
 * Created by Syed Wajahat on 9/23/2020.
 */
public class AccessClass {
    static public final void main(String[] args){
        OtherClass otherClass = new OtherClass();
        //The below message cannot be accessed as it has default access.
        //otherClass.testIt();
    }
}
