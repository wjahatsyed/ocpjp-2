package com.wjahatsyed.ocp.chapter_one.random_3;

/**
 * Created by Syed Wajahat on 9/27/2020.
 */
public class MyVarArgClass {
    public int myVarArgsMethod(int i, int... args) {
        int temp = 0;
        if (args.length > 0 && args.length == i) {
            while (i - 1 > 0) {
                temp += args[i - 1];
                i--;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        MyVarArgClass myVarArgClass = new MyVarArgClass();
        System.out.println(myVarArgClass.myVarArgsMethod(3, 5, 15, 25));
    }
}
