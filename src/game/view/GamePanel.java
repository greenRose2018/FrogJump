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
	private JPanel mainMenu;
	private JPanel gamePanel;
	
	private JButton onePlayer;
	private JButton twoPlayers;
	private JLabel gameImage;
	
	
	public GamePanel(GameController appController)
	{
		super();
		this.appController = appController;
		layout = new SpringLayout();
		panelContainer = new JLayeredPane();
		mainMenu = new JPanel();
		gamePanel = new JPanel();
		
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
		onePlayer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
		twoPlayers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
	}
}
