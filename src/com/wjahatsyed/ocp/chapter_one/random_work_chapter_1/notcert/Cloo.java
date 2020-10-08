package com.wjahatsyed.ocp.chapter_one.random_work_chapter_1.notcert;

import com.wjahatsyed.ocp.chapter_one.random_work_chapter_1.cert.Roo;

/**
 * Created by Syed Wajahat on 9/23/2020.
 */
public class Cloo extends Roo {
    public void testCloo() {
        System.out.println(doRooThings());
        /*
        The above is same as the following. this keyword is used implicitly
         */
        System.out.println(this.doRooThings());
    }
}
