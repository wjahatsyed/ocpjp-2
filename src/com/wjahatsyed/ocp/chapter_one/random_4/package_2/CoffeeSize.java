package com.wjahatsyed.ocp.chapter_one.random_4.package_2;

import com.sun.istack.internal.NotNull;

/**
 * Created by Syed Wajahat on 9/28/2020.
 */
public enum CoffeeSize {
    BIG(8), HUGE(10), OVERWHELMING(16){
        @Override
        public String getLidCode(){
            return "B";
        }
    }; //This semi-colon is mandatory
    private int ounces;

    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    @NotNull
    public String getLidCode(){
        return "A";
    }
}
