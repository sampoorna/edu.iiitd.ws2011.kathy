package edu.iiitd.ws2011.kathy;

import java.util.ArrayList;
import java.util.Scanner;

public class KathyMain
{
	
	public static void main(String[] args)
	{
		
		String incomingQuery;
		long incomingPhoneNumber;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter incoming phone number:");
		incomingPhoneNumber = s.nextLong();
		System.out.println("Enter incoming query:");
		incomingQuery = s.next();
		
		Asker asker = new Asker(incomingQuery, incomingPhoneNumber);
		
		Query userQuery = new Query(incomingQuery);
		
		String queryCategory;
		
		// feed userQuery to CategoryMatcher to get queryCategory
		
		ArrayList<Subscriber> subscriberList = new ArrayList<Subscriber>();
		
		// feed queryCategory to UserMatcher to get subscriberList
		
		ArrayList<Integer> phoneNumbers = new ArrayList<Integer>();
		
		// for each element in subscriberList, copy the phone number to phoneNumbers
		
		// feed phoneNumbers to Sender, which outputs the numbers (to show who's getting the message)
		
		ArrayList<String> queryKeywords = new ArrayList<String>();
		
		// feed userQuery to KeywordExtractor to get queryKeywords
		
		ArrayList<String> dbAns = new ArrayList<String>();
		
		// feed queryKeywords to KeywordMatcher to get dbAns
		
		ArrayList<String> commAns = new ArrayList<String>();
		
		String entry;
		
		while(true)
		{
			System.out.println("Enter community answer (enter 0 to stop entering answers):");
			entry = s.next();
			if(entry.equals("0"))
				break;
			commAns.add(entry);
		}
		
		ArrayList<DBEntry> dbReplies = new ArrayList<DBEntry>();
		ArrayList<DBEntry> commReplies = new ArrayList<DBEntry>();
		
		for(String i : dbAns)
		{
			dbReplies.add(new DBEntry(i));
		}
		
		for(String j : commAns)
		{
			commReplies.add(new DBEntry(j));
		}
		
		// feed dbReplies and commReplies to KeywordExtractor to get them back with keywords
		
		ArrayList<DBEntry> bestCommReplies = new ArrayList<DBEntry>();
		
		// feed commReplies and userQuery to KeywordMatcher to get three bestCommReplies
		
		System.out.println("Which answer was most useful to you?");
		
		int bestAns = s.nextInt();
		
		asker.setBestAns(bestAns);
		userQuery.setBestAns(bestAns);
		
		DBEntry bestReply = new DBEntry(userQuery.getBestAns());
		
		// feed bestReply to KeywordExtractor to get it back with its keywords
		
		boolean inBestCommReplies = false;
		
		for(String i : commAns)
		{
			if(i.equals(userQuery.getBestAns()))
			{
				inBestCommReplies = true;
				break;
			}
		}
		
		if(inBestCommReplies)
		{
			// add bestCommReplies to database using DBHAndler
		}
		else
		{
			// add keywords of userQuery to keywords of bestReply
			// add bestReply and bestCommReplies to database using DBHandler
		}
		
	}
	
}
