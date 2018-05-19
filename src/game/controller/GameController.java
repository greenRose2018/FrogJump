package game.controller;

import game.model.*;
import game.view.*;

public class GameController
{
	private GameFrame gameFrame;
	
	public GameController()
	{
		gameFrame = new GameFrame(this);
	}
	public void Start()
	{
		
	}
	
	public GameFrame getGameFrame()
	{
		return gameFrame;
	}
	
}
