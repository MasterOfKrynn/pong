package com.pong;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Pong extends JApplet
{
	private PaintSurface canvas;
	
	public void init()
	{
		this.setSize(550, 500);	
		canvas = new PaintSurface();
		this.add(canvas, BorderLayout.CENTER);
	
		Timer t = new Timer(20, e -> {canvas.repaint();} );t.start();	
	}

	class PaintSurface extends JComponent
	{
		boolean directionIsRight = true;
		boolean directionIsUp = true;
		int speed = 4;
		int paddle1Y = 200;
		int paddle2Y = 200;
		int ballX = 450;
		int ballY = 250;
		
		public void paint(Graphics g) 
		{
			//Drawing
			Graphics2D g2D = (Graphics2D)g;
			g2D.setRenderingHint
			(
					RenderingHints.KEY_ANTIALIASING, 
					RenderingHints.VALUE_ANTIALIAS_ON
			);
					
			Shape paddle1Image = new Rectangle2D.Float(50, paddle1Y, 10, 75);
			Shape paddle2Image = new Rectangle2D.Float(500, paddle2Y, 10, 75);
			Shape ballImage = new Ellipse2D.Float(ballX, ballY, 50, 50);
					
			g2D.setPaint(Color.BLACK);
			g2D.fill(paddle1Image);
			g2D.fill(paddle2Image);
			g2D.fill(ballImage);
		
			//Controls
//			public void KeyPressed(KeyEvent key)
//			{
//			
//			
//			
//			
//			
//			
//			}			
			
			//Moving the Ball
			if(directionIsRight)
			{
				ballX += speed;
			}
			else
			{
				ballX -= speed;
			}
		
			if(directionIsUp)
			{
				ballY += speed;
			}
			else
			{
				ballY -= speed;
			}
		}
	}

//	void ketPressed(KeyEvent key)
//	{
//		
		
		
		
		
		
		
//		if(key.getSource() == "w")
//		{
//			paddle1Y++;
//		}
	
	
	
	
//	}
}
