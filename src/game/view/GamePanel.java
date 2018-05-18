package game.view;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

import javax.swing.*;
import game.controller.GameController;

public class GamePanel extends JPanel
{
	private GameController appController;
	private SpringLayout layout;
	private JLayeredPane panelContainer;
	
	private JButton onePlayer;
	private JButton twoPlayers;
	private JLabel gameImage;
	
	
	public GamePanel(GameController appController)
	{
		super();
		this.appController = appController;
		layout = new SpringLayout();
		panelContainer = new JLayeredPane();
		gameImage = new JLabel(new ImageIcon(getClass().getResource("will add soon")), JLabel.CENTER);		
		
		onePlayer = new JButton("One Player");
		twoPlayers = new JButton("Two Players");
		
		
	}
	
	public void setupLayouts()
	{
		
	}
	public void setupPanel()
	{
		
	}
	public void setupListeners()
	{
		
	}
}
