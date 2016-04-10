package view;
import javax.swing.JFrame;
import controller.Controller;

public class Frame extends JFrame
{
	private Panel basePanel;
	private Controller baseController;

	public Frame(Controller baseController)
	{
		this.baseController = baseController;
		basePanel = new Panel(baseController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(280, 200);
		this.setResizable(false);
		this.setTitle("Abstract GUI");
		this.setVisible(true);
	}
}
