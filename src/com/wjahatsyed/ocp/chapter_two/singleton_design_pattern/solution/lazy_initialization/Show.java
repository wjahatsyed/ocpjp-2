package com.wjahatsyed.ocp.chapter_two.singleton_design_pattern.solution.lazy_initialization;

import java.util.Set;

/**
 * Created by Syed Wajahat on 10/21/2020.
 */
public class Show {
    private Show() {
        //private constructor
    }

    private static Show INSTANCE;

    private Set<String> availableSeats;


}
