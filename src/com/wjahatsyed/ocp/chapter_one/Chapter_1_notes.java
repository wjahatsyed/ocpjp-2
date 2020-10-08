package com.wjahatsyed.ocp.chapter_one;

/**
 * Created by Syed Wajahat on 7/13/2020.
 * Abstract classes and interfaces
 * An interface is a contract which a class agrees to when it inherits the interface.
 * In an interface, it is defined what a class must do but not how it will do.
 *
 * In abstract classes, we can have both abstract and non-abstract method. We can also
 * have abstract and non-abstract methods in there.
 *
 * In interface, everything is public. All the methods, whether abstract, static or default,
 * all of them are public. default methods can be overridden in the class which implements that interface.
 * No method in interface can be final even it is default or static.
 *
 * The only thing which can be marked final in an interface is the constant.
 * A constant is static and final and yes, in interface everything is public.
 *
 * In an interface, there is no constructor as there is nothing i.e. no fields to be initialized as
 * it cannot have any fields except constants.
 *
 * Static methods cannot be overridden but over-hidden.
 *
 * For overriding methods, keep in mind the concept of virtual method invocation.
 *
 * An abstract class does have a constructor however an abstract class cannot be instantiated but
 * as we know, it can have fields (non-constants) so the constructor is used to initialize those fields.
 *
 * In interfaces, whether you mark it or not, all methods are public and abstract if not default or static
 * and default and static methods are always public. In fact, everything in the interface is public.
 *
 * For constants in the interface, all constants are public static and final even if not marked.
 * thanks to the compiler.
 *
 * Default methods in interfaces cannot be private, protected or default and it cannot be static, final or abstract.
 * default and static methods must have a body in interfaces.
 *
 * An interface static method can be accessible thru the interface name.
 * Static methods in an interface cannot be protected, private or default acces.
 * They cannot be marked abstract or final.
 *
 * Gold standard: In interface, only constants are final, nothing else can be final.
 *
 * The methods and instance variables in a class are known as it's members.
 *
 * Access modifiers
 * There are four access modifiers for methods and instance variables
 *
 * public, protected, default and private.
 * A class can either be public or default.
 *
 * Access control:
 * There are two types of access control.
 * 1. if class A can access class B. i.e. create an instance of that class
 * 2. if class A can access specific members of class B.
 *
 * If a method is accessed without the dot (.) operator, it means that
 * either it is a member of the same class or of the super class. It depends on the
 * accessibility level (access modifier) as well.
 *
 * private members are only accessible in the same class where they are declared.
 * If a member is declared private, it cannot be accessed by the any of the sub classes.
 *
 * If we have a private method in a superclass and same name method in the subclass that means
 * the rule of overriding (polymorphism) does not apply as the method is private.
 *
 * The only difference between default and protected members is that default members are only accessible to sub classes
 * which are in the same package however protected members are available in subclasses which are even outside the package.
 *
 * The default members are only available in the same package but protected members are available in the same package and in kids classes.
 *
 * Protected member details
 *
 * For a subclass outside the package,
   the protected member can be accessed only through inheritance.
 *
 * default access means package level.
 *
 * No access modifier can be applied to a local variable. A local variable is a variable
 * inside a method. Any local variable with an access modifier will never compile.
 *
 * For a local variable, no access/non-access modifier can be applied except for final (non-access modifier)
 *
 * The final keyword:
 * A class marked final cannot be subclassed such as the String class in JAVA.
 * A method marked final cannot be overridden. Trying to override a final method
 *
 * Method arguments are those which appear in between of a method signature and they are variables declarations.
 *
 * If a method argument is marked final, it means that the value that is passed to this cannot be changed.
 * For reference variable, the value of the object it is referencing to can be changed but it cannot be forced
 * to the reference variable to refer to a different object.
 *
 * Abstract methods
 * We can have abstract methods only in abstract classes or interfaces. Not even a single abstract method is allowed
 * in a non-abstract class.
 *
 * 
 *
 *
 */
public class Chapter_1_notes {
}
