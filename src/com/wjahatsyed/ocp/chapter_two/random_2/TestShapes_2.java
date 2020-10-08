package com.wjahatsyed.ocp.chapter_two.random_2;

/**
 * Created by Syed Wajahat on 10/2/2020.
 */
public class TestShapes_2 {
    public static void main(String[] args) {
        PlayerPiece playerPiece = new PlayerPiece();
        TilePiece tilePiece = new TilePiece();
        doShapes(playerPiece);
        doShapes(tilePiece);
    }

    public static void doShapes(GameShape gameShape) {
        gameShape.displayShape();
    }
}
