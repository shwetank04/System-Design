package com.bookmyshow;

public abstract class User {
	
public static int idCounter = 0;
public int id;
public String name;
public User(String name) {
	idCounter ++;
	this.id = idCounter;
	this.name = name;
}

public String getName() {
	return name;
}

}
