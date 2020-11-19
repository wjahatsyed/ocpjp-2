package com.wjahatsyed.ocp.chapter_two.singleton_design_pattern.solution.eager_initialization;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Syed Wajahat on 10/20/2020.
 * Make the constructor private
 * Create a constant which refers to a newly created object of the class
 * create a static method to return the instance
 *
 * This example has eager initialization
 */
public class Show {
    /*
    A private static variable to store the single instance called the singleton. This variable is usually final to
    keep developers from accidentally changing it.
    A public static method for callers to get a reference to this instance.
    A private constructor so no callers can instantiate the object directly.
     */
    private static final Show INSTANCE = new Show();

    private Set<String> availableSeats;

    public static Show getInstance() {
        return INSTANCE;
    }

    private Show() {
        //Callers cannot create directly anymore.
        //Must use getInstance()

        availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static void main(String[] args) {
        ticketAgentBooks("1A");
        ticketAgentBooks("1A");
    }

    private static void ticketAgentBooks(String seat) {
        Show show = Show.getInstance();
        System.out.println(show.bookSeat(seat));
    }


}
