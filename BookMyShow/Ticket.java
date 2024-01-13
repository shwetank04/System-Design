package com.bookmyshow;

import java.util.Date;

public class Ticket {
public static int idCounter = 0;
private int id;
private String ownerName;
private Date bookingTime;
private int noOfSeats;
private Show bookedShow;
private String theatre;
public Ticket(String ownerName, Date bookingTime, int noOfSeats,String theatre) {
	idCounter++;
	this.id = idCounter;
	this.ownerName = ownerName;
	this.bookingTime = bookingTime;
	this.noOfSeats = noOfSeats;
	this.bookedShow = bookedShow;
	this.theatre = theatre;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public Date getBookingTime() {
	return bookingTime;
}
public void setBookingTime(Date bookingTime) {
	this.bookingTime = bookingTime;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public Show getBookedShow() {
	return bookedShow;
}
public void setBookedShow(Show bookedShow) {
	this.bookedShow = bookedShow;
}

public String getTicketInfo() {
	
	return "Ticket booked for: "+ this.ownerName + "Number of seats booked "+this.noOfSeats +" in theater: "+this.theatre;
	
}

public int cancleTicket() {
	this.ownerName = null;
	this.noOfSeats = 0;
	this.theatre = null;
	
	System.out.println("Ticket got cancelled successfully");
	return 1;
}

}
