package com.bookmyshow;

import java.util.ArrayList;

public class RegisteredUser extends User {
private boolean isLoggedIn;
public RegisteredUser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.bookingHistory = new ArrayList<>();
		isLoggedIn = false;
	}

private ArrayList<Ticket> bookingHistory;

public void login(String name,String password) {
	isLoggedIn = true;
}
}
