package view;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import controller.Controller;
import model.*;

public class Panel extends JPanel
{
	
	private SpringLayout baseLayout;	
	private Controller baseController;
	private JTable arrayTable;
	private JScrollPane arrayScroll;

	public Panel(Controller baseController)
	{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	
	String [] nameCol = {"Show Name", "Genre", "Seasons"};
	Object [] [] info ={
			{"Breaking Bad", "Crime Film", "5"},
			{"The Walking Dead", "Action", "7"}
			};
	arrayScroll = new JScrollPane();
	
	arrayTable = new JTable(info, nameCol);
	arrayScroll.setViewportView(arrayTable);

	arrayTable.setPreferredScrollableViewportSize(new Dimension(10,10));
	arrayTable.setFillsViewportHeight(true);
	

	setupPanel();
	setupLayout();
	

	}

	private void setupPanel()
	{
		this.add(arrayScroll);
		this.setLayout(baseLayout);
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, arrayScroll, 54, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, arrayScroll, 27, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, arrayScroll, -33, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, arrayScroll, 280, SpringLayout.WEST, this);

	}

}
