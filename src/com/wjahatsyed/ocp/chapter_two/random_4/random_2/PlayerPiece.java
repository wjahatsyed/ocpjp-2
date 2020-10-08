package com.wjahatsyed.ocp.chapter_two.random_4.random_2;

/**
 * Created by Syed Wajahat on 10/7/2020.
 * Remember that method invocations allowed by the compiler are based
 * solely on the declared type of the reference, regardless of the object type. So
 * looking at the four reference types again—Object, GameShape, PlayerPiece,
 * and Animatable—which of these four types know about the displayShape()
 * method?
 * You guessed it—both the GameShape class and the PlayerPiece class are
 * known (by the compiler) to have a displayShape() method, so either of
 * those reference types can be used to invoke displayShape().
 * <p>
 * Think about inheritance here
 * Overriding is related to dynamic time binding which is related to VMI.
 *
 * Only overridden instance methods are dynamically invoked
 based on the real object’s type.
 */
public class PlayerPiece extends GameShape implements Animatable {
    public void animate() {
        System.out.println("Animating");
    }

    public static void main(String[] args) {
        /*
        An object in memory can be accessed by a reference of a parent type, a reference of the same type as the object
        or a reference of an interface that is implemented by that
         */
        Object object = new PlayerPiece();
        Animatable animatable = new PlayerPiece();
        GameShape gameShape = new PlayerPiece();
        PlayerPiece playerPiece = new PlayerPiece();

        //Another example
        PlayerPiece playerPiece1 = new PlayerPiece();
        //de-referencing by reassignment
        Object o = playerPiece1;
        GameShape shape = playerPiece1;
        Animatable animatble = playerPiece1;

        shape.displayShape();
        playerPiece1.displayShape();

    }
}
