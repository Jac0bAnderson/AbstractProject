package model;


public abstract class Music

{
	//Three data memebers 
	private String title;
	private String genre;
	private int songLength;
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getGenre()
	{
		return genre;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public int getSongLength()
	{
		return songLength;
	}
	public void setSongLength(int songLength)
	{
		this.songLength = songLength;
	}
	public int philanthropist()
	{
		int n=123;
		return n;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof IronMan)
		{
			if(this.philanthropist() > ((IronMan) compared).philanthropist())
			{
				comparedValue = 1;
			}
			else if(this.philanthropist() < ((IronMan) compared).philanthropist())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
	
	public String toString()
	{
		String description = "This is a " + this.getClass() + " and has a ";
		
		return description;
		
	}
	
}




