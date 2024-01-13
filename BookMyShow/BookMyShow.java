package com.bookmyshow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class BookMyShow {
    private ArrayList<User> users;
    private ArrayList<Theater> theaters;
    private HashMap<String, ArrayList<Show>> movieMap;

    public BookMyShow(ArrayList<User> users, ArrayList<Theater> theaters) {
        this.users = users;  // Initialize with the provided users list
        this.theaters = theaters;  // Initialize with the provided theaters list
        this.movieMap = new HashMap<>();
        generateMovieMap();
    }

    private void generateMovieMap() {
        for (Theater theater : this.theaters) {
            for (Show shows : theater.getShows()) {
                if (this.movieMap.containsKey(shows.getMovie().getName())) {
                    this.movieMap.get(shows.getMovie().getName()).add(shows);
                } else {
                    ArrayList<Show> showList = new ArrayList<>();
                    showList.add(shows);
                    this.movieMap.put(shows.getMovie().getName(), showList);
                }
            }
        }
    }

    public ArrayList<Show> searchShows(String movieName) throws Exception {
        if (this.movieMap.containsKey(movieName)) {
            return this.movieMap.get(movieName);
        } else {
            throw new Exception("No Shows Present for the given movie");
        }
    }

    public Ticket bookTickets(Show show, int seats, User user, String theatre) throws Exception {
        if (user instanceof RegisteredUser) {
            return show.bookTicket(seats, (RegisteredUser) user, theatre);  // Return the booked ticket
        } else {
            throw new Exception("User is not registered");
        }
    }
}
