package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading.overloading_methods;

/**
 * Created by Syed Wajahat on 10/9/2020.
 */
public class OverloadingMethods {
    /*
    Overloading can be in the same class or super/sub classes. Both are okay.

        1. Overloaded methods MUST change the argument list. Change the order, increase or decrease the order
           but the argument list must be changed.

        2. Overloaded methods CAN change the return type.

        3. Overloaded methods CAN change the access modifier.

        4. A method can be overloaded in the same type or subtype. In other words, if Class A defines a doStuff(int i)
        method, then subclass B could define a doStuff(String s) method without overriding the superclass version that
        takes an int. So two methods with the same name but in different types can still be considered overloaded if the
        subtype inherits one version of the method and then declares another overloaded version in its type definition.

        By types, we mean SuperClass and Subclass.

        Only argument list is involved in overloading.


     */
}
