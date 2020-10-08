package com.wjahatsyed.ocp.chapter_two.random_2;

/**
 * Created by Syed Wajahat on 10/2/2020.
 */
public class TilePiece extends GameShape {
    public void getAdjacent() {
        System.out.println("getting adjacent tiles");
    }

    @Override
    public void displayShape(){
        System.out.println("displaying TilePiece");
    }
}
