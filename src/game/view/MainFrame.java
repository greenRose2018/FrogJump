package game.view;

import game.controller.*;
import javax.swing.*;

public class MainFrame extends JFrame
{
	private GameController appController;
	private MainPanel gamePanel;
	
	public MainFrame(GameController appController)
	{
		super();
		this.appController = appController;
		gamePanel = new MainPanel(appController);
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
