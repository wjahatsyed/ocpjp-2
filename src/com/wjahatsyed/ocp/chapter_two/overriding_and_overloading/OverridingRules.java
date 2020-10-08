package com.wjahatsyed.ocp.chapter_two.overriding_and_overloading;

/**
 * Created by Syed Wajahat on 10/7/2020.
 * Rules for overriding methods
 */
public class OverridingRules {
    /*
    1. The argument list must match that of the overridden method. If they don't match,
     * you can end up with an overloaded method you didn't intend.

    2. The return type must be the same as, or a subtype of, the return type (covariant)
       declared in the original overridden method in the superclass.

    3. The access level cannot be more restrictive than that of the overridden method.

    4. The access level CAN be less restrictive than that of the overridden method.

    5. Instance methods can be overridden only if they are inherited by the subtype.
       A subtype within the same package as the instance's supertype can override any supertype method that is
       not marked private or final.
       A subtype in a different package can override only those non-final methods marked public or protected since
       protected methods are inherited by the subtype.

    6. The overriding method CAN throw any unchecked (runtime) exception, regardless of whether the overridden method
       declares the exception.

    7. The overriding method must NOT throw checked exceptions that are new or broader than those declared by the overridden method.
       For example, a method that declares a FileNotFoundException cannot be overridden by a method that declares a SQLException, or
       any other non-runtime exception unless it's a subclass of FileNotFoundException.

    8. The overriding method can throw narrower or fewer exceptions. Just because an overridden method "takes risks" doesn't mean that
       the overriding subtype's exception takes the same risks. Bottom line: an overriding method doesn't have to declare any exceptions
       that it will never throw, regardless of what the overridden method declares.

    9. You cannot override a method marked final.


    10. You cannot override a method marked static. We will look






     */
}
