package com.bookmyshow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String args []) throws ParseException{
		//Users
		RegisteredUser shwetank = new RegisteredUser("Shwetank");
		GuestUser happy = new GuestUser("Happy");
		
		ArrayList<User> users = new ArrayList<>();
		users.add(shwetank);
		users.add(happy);
		
		//Movie
		Movie ironMan = new Movie("IronMan",Language.ENGLISH,Genre.ACTION);
		
		
		//Theater
		Theater pvr = new Theater("Pvr", "Patna", 30);
		ArrayList<Theater> theaters = new ArrayList<>();
		theaters.add(pvr);

		//Shows
		SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM dd, yyyy HH:mm:ss a");
		Show ironManShow = new Show(formatter.parse("Friday, May 10, 2023 10:00:00 AM"), ironMan, pvr);
		
		//BookMyShow
		BookMyShow book = new BookMyShow(users,theaters);
		
		//Search shows
		try {
			ArrayList<Show> searchShows = book.searchShows("IronMan");
			System.out.println("Searched shows "+searchShows.get(0).toString());
		}catch(Exception e) {
			System.out.println("No shows found");
		}
		
		//Book Tickets
		try {
			Ticket shwetankTicket = book.bookTickets(ironManShow, 1, shwetank, pvr.getName());
			System.out.println(shwetankTicket.getTicketInfo());
		}catch(Exception e) {
			System.out.println("Cant book tickets");
		}
	}

}

