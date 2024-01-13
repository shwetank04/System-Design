package com.bookmyshow;

import java.util.Date;

public class Show {
public static int idCounter = 0;
private int id;
private Date showTime;
private int availableSeats;

private Movie movie;
private Theater theater;
public Show(Date showTime, Movie movie, Theater theater) {
	idCounter++;
	this.id = idCounter;
	this.showTime = showTime;
	this.movie = movie;
	this.theater = theater;
	this.availableSeats = theater.getCapacity();
	theater.getShows().add(this);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getShowTime() {
	return showTime;
}
public void setShowTime(Date showTime) {
	this.showTime = showTime;
}
public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}
public Theater getTheater() {
	return theater;
}
public void setTheater(Theater theater) {
	this.theater = theater;
}



@Override
public String toString() {
	return "Show [id=" + id + ", showTime=" + showTime + ", availableSeats=" + availableSeats + ", movie=" + movie
			+ ", theater=" + theater + "]";
}
public Ticket bookTicket(int seats, RegisteredUser user, String theatre) throws Exception {
	if(this.availableSeats < seats) {
		throw new Exception("Seats not available");
	}
	else {
		Ticket ticket = new Ticket(user.getName(), new Date(), seats,theatre);
		this.availableSeats -= seats;
		System.out.println("Ticket booked successfully");
		return ticket;
	}
	
}

}
