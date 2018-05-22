package game.view;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Frog extends JPanel implements ActionListener, KeyListener
{
	private Timer timer;
	private double x;
	private double y;
	private double velx;
	private double vely;
	//private ImageIcon frogImage;
	private BufferedImage frogImage;
	public Frog()
	{		
		x = 0;
		y = 0;
		velx = 0;
		vely = 0;
		
		//frogImage = new ImageIcon("game/view/images/frogKing.png");
		try
		{
			frogImage = ImageIO.read(getClass().getResource("images/frogKing.png"));
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		timer = new Timer(5,this);
		timer.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	
	public void up()
	{
		vely = -1.5;
		velx = 0;
	}
	public void down()
	{
		vely = 1.5;
		velx = 0;
	}
	public void left()
	{
		velx = -1.5;
		vely = 0;
	}
	public void right()
	{
		velx = 1.5;
		vely = 0;
	}

	public void keyPressed(KeyEvent e)
	{
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP)
		{
			up();
		}
		if(code == KeyEvent.VK_DOWN)
		{
			down();
		}
		if(code == KeyEvent.VK_LEFT)
		{
			left();
		}
		if(code == KeyEvent.VK_RIGHT)
		{
			right();
		}		
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
		x += velx;
		y += vely;
	}
	
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		
		graphics.drawImage( frogImage, (int)x, (int)y, null);
//		Graphics2D g2 = (Graphics2D) graphics;
//		g2.fill(new Ellipse2D.Double(x,y,40,40));
		
	}
}
