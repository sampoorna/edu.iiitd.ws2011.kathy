package edu.iiitd.ws2011.kathy;

import java.util.ArrayList;

public class Query
{
	
	// fields
	
	String query;
	ArrayList<String> commAns;
	ArrayList<String> dbAns;
	String bestAns;
	
	// constructors
	
	public Query(String s)
	{
		query = s;
		commAns = new ArrayList<String>();
		dbAns = new ArrayList<String>();
	}
	
	// methods
	
	public void addCommAns(String...s)
	{
		for(String i : s)
			commAns.add(i);
	}
	
	public void addDBAns(String...s)
	{
		for(String i : s)
			dbAns.add(i);
	}
	
	public void setBestAns(int n)
	{
		
		int dbLength = dbAns.size();
		
		if(n > dbLength)
			bestAns = commAns.get(n-dbLength);
		else
			bestAns = dbAns.get(n);
	}
	
	public String getQuery()
	{
		return query;
	}
	
	public ArrayList<String> getCommAns()
	{
		return commAns;
	}
	
	public ArrayList<String> getDBAns()
	{
		return dbAns;
	}
	
	public String getBestAns()
	{
		return bestAns;
	}
	
}
