package controller;
import java.util.ArrayList;

import model.BreakingBad;
import model.IronMan;
import model.IronMan3;
import model.WalkingDead;
import view.Frame;
public class Controller 
{
	private Frame baseFrame;
	private ArrayList<IronMan> IronDude;
	 public Controller()
	 {
		 baseFrame = new Frame(this);
	 }
	 private void makeIronList()
	 {
		 IronDude.add(new BreakingBad());
		 IronDude.add(new WalkingDead());
		 IronDude.add(new IronMan3());
	 }
	 public void swap(int firstlocation, int secondLocation)
	 {
		 IronMan temp = IronDude.get(firstlocation);
		 IronDude.set(firstlocation, IronDude.get(secondLocation));
		 IronDude.set(secondLocation, temp);
	 }
	 public void insertionSort()
	 {
		 for(int outerLoop = 1; outerLoop < IronDude.size(); outerLoop++)
		 {
			 int innerLoop = outerLoop;
			 while(innerLoop >0 &&(IronDude.get(innerLoop-1).compareTo(IronDude.get(innerLoop)))>0)
			 {
				 swap(innerLoop, innerLoop-1);
				 innerLoop--;
			 }
		 }
	 }
	 public void quickSort(int low, int high)
	 {
		 if(low < high)
		 {
			 int midPoint = partition(low, high);
			 quickSort(low, midPoint -1);
			 quickSort(midPoint+1, high);
		 }
	 }
	 private int partition(int low, int high)
	 {
		 int position = low;
		 IronMan  pivot = IronDude.get(high);
		 for(int spot = low; spot < high-1; spot++)
		 {
			 if(IronDude.get(spot).compareTo(pivot) <=0)
			 {
				 swap(position, spot);
				 position++;
			 }
		 }
		 swap(position, high);
		 return position;
	 }
public void start()
{
	
}
}
