package com.wjahatsyed.ocp.chapter_two.singleton_design_pattern.solution.eager_initialization;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Syed Wajahat on 10/21/2020.
 * This example has eager initialization
 */
public class Show_2 {
    private static final Show_2 INSTANCE = new Show_2();

    private Set<String> availableSeats;

    private Show_2() {
        availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static Show_2 getInstance() {
        return INSTANCE;
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
