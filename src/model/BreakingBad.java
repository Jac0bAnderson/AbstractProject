package model;

public class BreakingBad extends tvshowsAndMovies
{
	public BreakingBad()
	{
		this.setShowName("Breaking Bad");
		this.setGenre("Crime Film");
		this.setSeasons(5);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wristRocket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IonBlaster() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int philanthropist() {
		int a =12;
		return a;
	}
	public String toString()
	{
		String description ="This a " +this.getClass();
		return description;
	}
	/**
	 * If the supplied variable compared names before the calling variable
	 * return -1.
	 * If the supplied variable is after the calling variable return 1.
	 * Else if they are the same, return 0.
	 */
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
