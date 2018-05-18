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
	
	private JPanel panelContainer;
	private JPanel mainMenu;
	private JPanel gamePanel;
	private JPanel scenePanel;
	
	private JButton onePlayer;
	private JButton twoPlayers;
	private JLabel gameImage;
	
	
	public GamePanel(GameController appController)
	{
		super();
		this.appController = appController;
		layout = new SpringLayout();
		
		panelContainer = new JPanel();
		mainMenu = new JPanel();
		gamePanel = new JPanel();
		
		gameImage = new JLabel("hello");		//new ImageIcon(getClass().getResource("will add soon")), JLabel.CENTER
		
		onePlayer = new JButton("One Player");
		twoPlayers = new JButton("Two Players");
		
		
		setupPanel();
		setupLayouts();
	}
	
	public void setupLayouts()
	{
		mainMenu.setBounds(0, 0, 450, 300);
		gamePanel.setBounds(0, 0, 450, 300);
		
		layout.putConstraint(SpringLayout.WEST, twoPlayers, 253, SpringLayout.WEST, mainMenu);
		layout.putConstraint(SpringLayout.SOUTH, twoPlayers, -108, SpringLayout.SOUTH, mainMenu);
		layout.putConstraint(SpringLayout.NORTH, onePlayer, 0, SpringLayout.NORTH, twoPlayers);
		layout.putConstraint(SpringLayout.EAST, onePlayer, -53, SpringLayout.WEST, twoPlayers);
	}
	public void setupPanel()
	{
		panelContainer.setLayout(new CardLayout());
		panelContainer.add(mainMenu);
		panelContainer.add(gamePanel);
		mainMenu.setLayout(layout);
		
		mainMenu.add(onePlayer);
		mainMenu.add(twoPlayers);
		
		gamePanel.add(gameImage);
		gamePanel.add(scenePanel);
		
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
