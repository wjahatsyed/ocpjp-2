package com.wjahatsyed.ocp.chapter_one.random_5;

/**
 * Created by Syed Wajahat on 9/29/2020.
 * Typical example of static/non static
 * Static members can access static members only.
 * Non static members can access both non static and static members
 */
public class Frodo extends Hobbit {
    public static void main(String[] args) {
        int myGold = 7;
        //System.out.println(countGold(myGold, 6));
    }
}

class Hobbit {
    int countGold(int x, int y) {
        return x + y;
    }
}
