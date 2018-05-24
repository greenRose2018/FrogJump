package game.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{	
	private Frog frog;

	public GameFrame()
	{
		super();
		frog = new Frog();
		setupFrame();
	}
	public void setupFrame()
	{
		this.add(frog);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
	}

}
