package model;

public class IronMan3 extends tvshowsAndMovies 
{
	public void Ironman3()
	{
		this.setShowName("Iron Man 3");
		this.setGenre("Action");
		this.setSeasons(0);
	}

	@Override
	public void fly() {
		
		
	}

	@Override
	public void wristRocket() {
		
		
	}

	@Override
	public void IonBlaster() {
		
		
	}

	@Override
	public int philanthropist() {
		int c = 125;
		return c;
		
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
