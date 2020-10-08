package com.wjahatsyed.ocp.chapter_one.association.aggregation;

/**
 * Created by Syed Wajahat on 9/16/2020.
 * A student belongs to department i.e. student has a department but it is possible
 * for a department not to have any student like sometimes the department is not offering any course.
 */
public class Student {
    private Department department;

    public Student(Department department) {
        this.department = department;
    }
}
