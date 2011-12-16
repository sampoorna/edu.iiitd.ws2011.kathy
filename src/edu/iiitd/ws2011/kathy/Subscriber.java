package edu.iiitd.ws2011.kathy;

import java.util.ArrayList;

public class Subscriber
{
	
	// fields
	
	private int phoneNumber;
	private ArrayList<String> categories;
	
	// constructors
	
	public Subscriber(int n, String...s)
	{
		phoneNumber = n;
		categories = new ArrayList<String>();
		for(String i : s)
			categories.add(i);
	}
	
	// methods
	
	public int getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public ArrayList<String> getCategories()
	{
		return categories;
	}
	
}
