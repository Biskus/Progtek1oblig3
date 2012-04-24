package tretten.en;

public class Runme2 {
	public static void main(String[] args)
	{
		DVDCollection collection = new DVDCollection();
		collection.newDVD("Die hard", 1996,128, 299.50);
		collection.newDVD("Titanic", 1997, 215, 399.50);
		collection.newDVD("Men in black", 1998, 109, 249);
		collection.newDVD("Revolution OS", 2001, 120, 0);
		collection.newDVD("Avatar", 2011, 295, 359.50);
		collection.newDVD("Shortmovie", 2010, 60, 199.50);
		
		collection.printMe();
		
		System.out.println();
		collection.printCollectionInfo();	
		
	}

}
