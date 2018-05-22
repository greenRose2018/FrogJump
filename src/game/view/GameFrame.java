package game.view;

import game.controller.*;
import javax.swing.*;

public class GameFrame extends JFrame
{
	private GameController appController;
	private GamePanel gamePanel;
	
	public GameFrame(GameController appController)
	{
		super();
		this.appController = appController;
		gamePanel = new GamePanel(appController);
		setupFrame();	
		
	}
	
	public void setupFrame()
	{
		this.setContentPane(gamePanel);
		this.setSize(600, 600);
		this.setTitle("Frog Jump");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public GameController getAppController() {
		return appController;
	}

	public void setAppController(GameController appController) {
		this.appController = appController;
	}

	
	
	
}
