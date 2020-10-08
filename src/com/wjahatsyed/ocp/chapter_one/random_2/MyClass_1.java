package com.wjahatsyed.ocp.chapter_one.random_2;

/**
 * Created by Syed Wajahat on 9/24/2020.
 */
public class MyClass_1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return this.getName() + " Age: " +this.getAge();
    }


}
