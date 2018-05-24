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
	private SpringLayout layoutTwo;
	private SpringLayout layoutThree;
	
	private JPanel mainMenu;
	private JPanel gamePanel;
	private JPanel scenePanel;
	
	private Frog animation;
	
	private JButton onePlayer;
	private JButton twoPlayers;
	private JLabel gameImage;
	
	
	public GamePanel(GameController appController)
	{
		super();
		this.appController = appController;
		layout = new SpringLayout();
		layoutTwo = new SpringLayout();
		layoutThree = new SpringLayout();
		
		mainMenu = new JPanel();
		gamePanel = new JPanel();
		scenePanel = new JPanel();
		
		animation = new Frog();
		
		gameImage = new JLabel(new ImageIcon(getClass().getResource("/game/view/images/frogKing.png")), JLabel.CENTER);
		onePlayer = new JButton("One Player");
		twoPlayers = new JButton("Two Players");
		
		setupPanel();
		setupLayouts();
		setupListeners();
		
	}
	
	public void setupLayouts()
	{
		mainMenu.setBounds(0, 0, 450, 300);
		gamePanel.setBounds(0, 0, 450, 300);
		
		layout.putConstraint(SpringLayout.NORTH, onePlayer, 0, SpringLayout.NORTH, twoPlayers);
		layout.putConstraint(SpringLayout.EAST, onePlayer, -142, SpringLayout.WEST, twoPlayers);
		layout.putConstraint(SpringLayout.NORTH, twoPlayers, -161, SpringLayout.SOUTH, mainMenu);
		layout.putConstraint(SpringLayout.SOUTH, twoPlayers, 0, SpringLayout.SOUTH, onePlayer);
		layout.putConstraint(SpringLayout.EAST, twoPlayers, -108, SpringLayout.EAST, mainMenu);
		layout.putConstraint(SpringLayout.WEST, onePlayer, 100, SpringLayout.WEST, mainMenu);
		layout.putConstraint(SpringLayout.SOUTH, onePlayer, -108, SpringLayout.SOUTH, mainMenu);
		layoutTwo.putConstraint(SpringLayout.NORTH, scenePanel, 0, SpringLayout.NORTH, gamePanel);
		layoutTwo.putConstraint(SpringLayout.WEST, scenePanel, 0, SpringLayout.WEST, gamePanel);
		layoutTwo.putConstraint(SpringLayout.SOUTH, scenePanel, -20, SpringLayout.SOUTH, gamePanel);
		layoutTwo.putConstraint(SpringLayout.EAST, scenePanel, 0, SpringLayout.EAST, gamePanel);
		layoutThree.putConstraint(SpringLayout.WEST, gameImage, 0, SpringLayout.WEST, scenePanel);
		layoutThree.putConstraint(SpringLayout.SOUTH, gameImage, 0, SpringLayout.SOUTH, scenePanel);
		layoutTwo.putConstraint(SpringLayout.WEST, gameImage, 70, SpringLayout.WEST, scenePanel);
		layoutTwo.putConstraint(SpringLayout.SOUTH, gameImage, -22, SpringLayout.SOUTH, scenePanel);
	}
	public void setupPanel()
	{
		setLayout(new CardLayout(0,0));
		this.add(mainMenu);
		this.add(gamePanel);
		
		mainMenu.setLayout(layout);
		gamePanel.setLayout(layoutTwo);
		scenePanel.setLayout(layoutThree);
		
		mainMenu.setVisible(true);
		mainMenu.add(onePlayer);
		mainMenu.add(twoPlayers);
		
		gamePanel.add(scenePanel);
		gamePanel.setVisible(false);
		
		scenePanel.add(gameImage);
		
	}
	public void setupListeners()
	{
		onePlayer.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				mainMenu.setVisible(false);
				gamePanel.setVisible(true);
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
