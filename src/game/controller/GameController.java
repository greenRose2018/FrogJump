package game.controller;

import game.model.*;
import game.view.*;
import javax.swing.JFrame;

public class GameController
{
	private MainFrame gameFrame;
	
	public GameController()
	{
		gameFrame = new MainFrame(this);
	}
	public void Start()
	{
		
	}
	
	public MainFrame getGameFrame()
	{
		return gameFrame;
	}
	
}
