package tretten.en;

import java.text.NumberFormat;
import java.util.LinkedList;

public class DVDCollection {
	
	//class members
	private DVD dvd;	
	private LinkedList<DVD> linkedlist;
	
	//constructor
	public DVDCollection()
	{
		linkedlist = new LinkedList<DVD>();		
	}
	
	//add dvd by existing object
	public void addDVD (DVD dvd)
	{
		linkedlist.add(dvd);
	}
	
	//add dvd by new dvd
	public void newDVD(String name, int year, int length, double cost)
	{
		dvd = new DVD(name, year, length, cost);
		linkedlist.add(dvd);
	}
	
	//print the entire list
	public void printMe()
	{
		for (DVD d : linkedlist)
		{
			System.out.printf("%s", d.toString());			
		}		
	}
	
	//print collection info
	public void printCollectionInfo()
	{
		StringBuilder sb = new StringBuilder();
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		double totalCost = 0;
		double avgCost = 0;
		int totalPlayTime = 0;
		int avgPlayTime = 0;
		int collectionSize = linkedlist.size();
		
		for (DVD d : linkedlist)
		{
			totalCost+= d.getCost();
			totalPlayTime += d.getLength();
		}	
		
		avgCost = totalCost / collectionSize;
		avgPlayTime = totalPlayTime / collectionSize;
		sb.append("--- COLLECTION INFO ---\n");
		sb.append("Number of movies: " + collectionSize + "\n");
		sb.append("Total cost: " + fmt.format(totalCost) + "\n");
		sb.append("Avg. cost: " + fmt.format(avgCost)+ "\n");
		sb.append("Total playtime: " + DVD.getLengthFormatted(totalPlayTime) + "\n");
		sb.append("Avg. playtime: " + DVD.getLengthFormatted(avgPlayTime) + "\n\n");
		
		System.out.println(sb.toString());
		
		
	}

}
