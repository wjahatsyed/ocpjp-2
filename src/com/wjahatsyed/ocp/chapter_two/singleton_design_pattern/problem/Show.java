package com.wjahatsyed.ocp.chapter_two.singleton_design_pattern.problem;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Syed Wajahat on 10/20/2020.
 */
public class Show {
    private Set<String> availableSeats;

    public Show() {
        availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static void main(String[] args){
        ticketAgentBooks("1A");
        ticketAgentBooks("1A");
    }

    private static void ticketAgentBooks(String seat){
        Show show = new Show();
        System.out.println(show.bookSeat(seat));
    }
}
