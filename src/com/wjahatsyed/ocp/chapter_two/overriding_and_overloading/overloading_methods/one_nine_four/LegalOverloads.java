package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.overloading_methods.one_nine_four;

import java.io.IOException;

/**
 * Created by Syed Wajahat on 10/9/2020.
 */
public class LegalOverloads {
    public void changeSize(int size, String name, float pattern) {
        //
    }

    //examples of overloading the above method
    protected void changeSize(int size, String name) {
        //changing the access modifier and decreasing the number of arguments
    }

    public int changeSize(int size, float pattern) {
        return 5;
    }

    public void changeSize(float pattern, String name) throws IOException {

    }
}
