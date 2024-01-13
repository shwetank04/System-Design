package com.bookmyshow;

public class GuestUser extends User {

	private boolean isRegistered;
	public GuestUser(String name) {
		super(name);
		this.isRegistered = false;
		// TODO Auto-generated constructor stub
	}
	
	public void register(String name, String email,String password) {
		isRegistered = true;
	}
}
