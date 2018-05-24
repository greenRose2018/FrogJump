package game.view;

import javax.swing.*;
import java.awt.Color;

public class GamePanel extends JPanel
{
	private JPanel options;
	private JButton menu;
	
	public GamePanel()
	{
		options = new JPanel();
		options.setBackground(Color.RED);
		menu = new JButton("Menu");
		
		setupPanel();
		setupLayout();
	}
	public void setupListeners()
	{
		
		
	}
	public void setupPanel()
	{
		this.add(options);
		options.setBounds(0,0,200, 31);
		//options.setLayout(new SpringLayout());
		options.add(menu);
	}
	public void setupLayout()
	{
	}
}
