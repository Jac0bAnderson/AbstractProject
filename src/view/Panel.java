package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SpringLayout;

import controller.Controller;
import model.*;

public class Panel extends JPanel
{
	
	private SpringLayout baseLayout;	
	private Controller baseController;
	private JTable arrayTable;
	private JScrollPane arrayScroll;
	private JButton sortButton;
	private JTextArea textArea;
	private boolean flip;
	private JToggleButton testB;
	public Panel(Controller baseController)
	{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	sortButton = new JButton("SORT");
	textArea = new JTextArea("");
	baseLayout.putConstraint(SpringLayout.NORTH, textArea, 71, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, textArea, 151, SpringLayout.WEST, this);
	testB = new JToggleButton("sort");
	baseLayout.putConstraint(SpringLayout.SOUTH, testB, -83, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, testB, -162, SpringLayout.EAST, this);
	flip = false;
	//String [] nameCol = {"Show Name", "Genre", "Seasons"};
	//Object [] [] info ={
		//	{"Breaking Bad", "Crime Film", "5"},
		//	{"The Walking Dead", "Action", "7"},
		//	{"Iron Man 3", "Action", "0"}
		//	};
	//arrayScroll = new JScrollPane();
	
	
	//arrayTable = new JTable(info, nameCol);
	//arrayScroll.setViewportView(arrayTable);

	//arrayTable.setPreferredScrollableViewportSize(new Dimension(5,5));
	//arrayTable.setFillsViewportHeight(true);
	

	setupPanel();
	setupLayout();
	setupListeners();
	

	}

	private void setupPanel()
	{
		this.add(testB);
		//this.add(sortButton);
		this.add(textArea);
		//this.add(arrayScroll);
		this.setLayout(baseLayout);
		
	}
	private void setupLayout()
	{
		//baseLayout.putConstraint(SpringLayout.NORTH, arrayScroll, 0, SpringLayout.NORTH, this);
		//baseLayout.putConstraint(SpringLayout.WEST, arrayScroll, 0, SpringLayout.WEST, this);
		//baseLayout.putConstraint(SpringLayout.SOUTH, arrayScroll, -236, SpringLayout.SOUTH, this);
		//baseLayout.putConstraint(SpringLayout.EAST, arrayScroll, 253, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 159, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButton, -114, SpringLayout.SOUTH, this);
	}

	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{ 
				
					if(flip = false)
					{
						baseController.insertionSort();
						String temp ="the sorted things are: \n";
						for(IronMan current : baseController.getIronDude())
						{
							temp += current.toString() + "\n";
						}
						textArea.setText(temp);
						//textArea.setText(baseController.showLevels());
						flip = true;
					}
					else if(flip = true)
					{
						textArea.setText("");
						flip = false;
					}
				
			
			}
		});
		testB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{ 
				if(testB.isSelected())
				{
					
						baseController.insertionSort();
						String temp ="the sorted things are: \n";
						for(IronMan current : baseController.getIronDude())
						{
							temp += current.toString() + "\n";
						}
						textArea.setText(temp);
						//textArea.setText(baseController.showLevels());
						flip = true;
				}
				if(! testB.isSelected())
				{
					textArea.setText("");
				}
					
			
			}
		});
	}
}
