package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading;

/**
 * Created by Syed Wajahat on 10/13/2020.
 */
public class FinalComparison {
    /*
    Arguments - for Overloaded, they must change but for overriding they must not change

    Return type - It can change for overloaded methods but for overriding methods it must be the same
    or must be a covariant (subtype)of the return type of the overridden method

    Exceptions - For overloaded methods, it does not impact so can change and for overriding methods, any unchecked
    exception can be thrown even if the overriding method is throwing any checked/unchecked exception or not but if the
    overridden method throws checked exception then overriding method must throw same or subclass of that checked exception.
    It cannot throw any new or different/broader checked exception. If the overriding method is not throwing any checked exception,
    its fine.

    Access modifier: For overloaded methods, it does not impact so it can change but for overriding methods, it must be the same
    or more accessible but cannot be less accessible.

    Invocation:
    For overloaded methods
    Reference type determines which overloaded version (based on declared argument types) is selected.
    Happens at compile time. The actual method that's invoked is still a virtual method invocation that happens
    at runtime, but the compiler will already know the signature of the method to be invoked. So at runtime, the argument
    match will already have bee nailed down, just not the class in which the method lives.

    Object type(in other words, the types of actual instance on the heap) determines which method is selected. Happens
    at runtime.


     */
}
