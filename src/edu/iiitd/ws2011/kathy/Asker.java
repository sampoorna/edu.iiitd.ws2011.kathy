package edu.iiitd.ws2011.kathy;

public class Asker
{
	
	// fields
	
	String query;
	long phoneNumber;
	int bestAns;
	
	// constructors
	
	public Asker(String s, long n)
	{
		query = s;
		phoneNumber = n;
	}
	
	// methods
	
	public void setBestAns(int n)
	{
		bestAns = n;
	}
	
	public String getQuery()
	{
		return query;
	}
	
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public int getBestAns()
	{
		return bestAns;
	}
	
}
