package model;

public abstract class tvshowsAndMovies implements IronMan, Comparable
{
private String showName;
private String genre;
private int seasons;

public String getShowName() 
{
	return showName;
}

public String getGenre() 
{
	return genre;
}

public int getSeasons() 
{
	return seasons;
}

public void setShowName(String showName) 
{
	this.showName = showName;
}

public void setGenre(String genre) 
{
	this.genre = genre;
}

public void setSeasons(int seasons) 
{
	this.seasons = seasons;
}
public String toString()
{
	String description ="This a " +this.getClass();
	return description;
}
public int compareTo(Object compared)
{
	int comparedValue = Integer.MIN_VALUE;
	if(compared instanceof IronMan)
	{
		if(this.philanthropist() > ((IronMan)compared).philanthropist())
		{
			comparedValue = 1;
		}
		else if(this.philanthropist() < ((IronMan)compared).philanthropist())
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
}
