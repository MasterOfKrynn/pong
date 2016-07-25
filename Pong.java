package com.pong;


import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Pong extends JApplet
{
	private PaintSurface canvas;
	
	public static void main()
	
	public void init()
	{
		this.setSize(1100, 1000);	
		canvas = new PaintSurface();
		this.add(canvas, BorderLayout.CENTER);
	
		Timer t = new Timer(20, e -> {canvas.repaint();} );t.start();	
	}

	class PaintSurface extends JComponent
	{
		boolean directionIsRight = true;
		boolean directionIsUp = true;
		int speed = 4;
		int paddle1Y = 250;
		int paddle2Y = 250;
		int ballX = 450;
		int ballY = 250;
		
		public void paint(Graphics g) 
		{
			Graphics2D g2D = (Graphics2D)g;
			g2D.setRenderingHint
			(
					RenderingHints.KEY_ANTIALIASING, 
					RenderingHints.VALUE_ANTIALIAS_ON
			);
					
			Shape paddle1Image = new Rectangle2D.Float(100, paddle1Y, 20, 150);
			Shape paddle2Image = new Rectangle2D.Float(900, paddle2Y, 20, 150);
			Shape ballImage = new Ellipse2D.Float(ballX, ballY, 100, 100);
		
			ballX += speed;
			
			g2D.setPaint(Color.BLACK);
			g2D.fill(paddle1Image);
			g2D.fill(paddle2Image);
			g2D.fill(ballImage);
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
