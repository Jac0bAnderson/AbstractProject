package model;

public class WalkingDead extends tvshowsAndMovies 
{
public WalkingDead()
{
	this.setShowName("The Walking Dead");
	this.setGenre("Action");
	this.setSeasons(6);
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
	int b = 12;
	return b;
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
