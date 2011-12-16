package edu.iiitd.ws2011.kathy;

import java.util.ArrayList;

public class DBEntry
{
	
	// fields
	
	private String entry;
	private ArrayList<String> keywords;
	
	// constructors
	
	public DBEntry(String s)
	{
		entry = s;
		keywords = new ArrayList<String>();
	}
	
	// methods
	
	public void addKeyword(String...s)
	{
		for(String i : s)
			keywords.add(i);
	}
	
	public String getEntry()
	{
		return entry;
	}
	
	public ArrayList<String> getKeywords()
	{
		return keywords;
	}
	
}
