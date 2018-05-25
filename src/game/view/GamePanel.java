package game.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel
{
	private JPanel options;
	private JButton menu;
	private FlowLayout flowLayout;
	private FlowLayout flowLayout1;
	
	public GamePanel()
	{
		flowLayout = (FlowLayout) getLayout();
		
		options = new JPanel();
		flowLayout1 = (FlowLayout) options.getLayout();
		
		options.setBackground(Color.RED);
		menu = new JButton("Menu");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	public void setupListeners()
	{
		
		menu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//work on this
			}
		});
		
	}
	public void setupPanel()
	{
		this.add(options);
		options.setBounds(0,0,69, 33);
		options.add(menu);
	}
	public void setupLayout()
	{
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout1.setVgap(3);
		flowLayout1.setHgap(270);
	}
}
