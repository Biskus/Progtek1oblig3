package tretten.en;

import java.text.NumberFormat;

public class DVD {
	private String title;
	private int releaseYear, length;
	private double cost;
	
	//getters and setters	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) 
	{		
		this.releaseYear = releaseYear;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//get formatted version of length
	public static String getLengthFormatted(int length)
	{
		StringBuilder sb = new StringBuilder();
		int hours = length/60;
		int minutes = length%60;
		if(minutes !=0)
		{
			if(hours != 1)
			{
				sb.append(hours + " hours, " + minutes + " minutes");
			}
			else
			{
				sb.append(hours + " hour, " + minutes + " minutes");
			}				
		}
		else
		{
			if(hours != 1)
			{
				sb.append(hours + " hours");
			}
			else
			{
				sb.append(hours + " hour");
			}
		}
		return sb.toString();
	}

	//constructor
	public DVD(String title, int year, int length, double cost)
	{
		this.title = title;
		this.releaseYear = year;
		this.length = length;
		this.cost = cost;
	}
	
	//toString
	@Override
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		StringBuilder sb = new StringBuilder();
		sb.append("Title: " + title + "\n");
		sb.append("Released: " + releaseYear + "\n");
		//sb.append("Length: " + length + " minutes\n");
		sb.append("Length: " + getLengthFormatted(length)+ "\n");
		sb.append("Cost: " + fmt.format(cost)+ "\n\n");
		return sb.toString();	
	}

}
