package game.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{	
	private Frog frog;
	private GamePanel gamePanel;

	public GameFrame()
	{
		super();
		frog = new Frog();
		gamePanel = new GamePanel();
		setupFrame();
	}
	public void setupFrame()
	{
		this.setContentPane(frog);
		this.getContentPane().add(gamePanel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
	}

}
