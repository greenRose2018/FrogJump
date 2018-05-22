package game.controller;

import game.model.*;
import game.view.*;
import javax.swing.JFrame;

public class GameController
{
	private GameFrame gameFrame;
	
	public GameController()
	{
		//gameFrame = new GameFrame(this);
	}
	public void Start()
	{
		JFrame f = new JFrame();
		Frog frog = new Frog();
		f.add(frog);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 600);
	}
	
	public GameFrame getGameFrame()
	{
		return gameFrame;
	}
	
}
