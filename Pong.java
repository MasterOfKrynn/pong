package com.pong;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Pong extends JFrame
{
	int speed = 4;
	
	Moveable paddle1 = new Moveable();
	Moveable paddle2 = new Moveable();
	
	Moveable ball = new Moveable();

	public static void main(String[] args)
	{
		new Pong();
	}
	
	public Pong()
	{
		this.setSize(1100, 1000);
		this.setTitle("Pong");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.add(new Paint(), BorderLayout.CENTER);
	
		this.setVisible(true);
	}

	private class Paint extends JComponent
	{
		public void paint(Graphics g) 
		{
			Graphics2D g2D = (Graphics2D)g;
			
			g2D.setRenderingHint
			(
					RenderingHints.KEY_ANTIALIASING, 
					RenderingHints.VALUE_ANTIALIAS_ON
			);
		
			g2D.setPaint(Color.BLACK);
			
			Shape paddle1Image = new Rectangle2D.Float(100, 250, 20, 140);
			Shape paddle2Image = new Rectangle2D.Float(100, 750, 20, 140);
			Shape ballImage = new Rectangle2D.Float(100, 250, 20, 140);

			
			
			g2D.draw(paddle1Image);
			g2D.draw(paddle1Image);

		
		}
	}
}
