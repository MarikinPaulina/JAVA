package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel{

	public DrawingPanel(MainClass frame) {
		this.frame = frame;
		this.addMouseListener(listener);
		this.addMouseMotionListener(listener);
	}

	public DrawingPanel(LayoutManager layout) {
		super(layout);
	}

	public DrawingPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public DrawingPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

	MainClass frame;
	BufferedImage image;
	BufferedImage image2;
	ArrayList<Figure> figures = new ArrayList<Figure>();
	ListeningMouse listener = new ListeningMouse(this);
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if(image2 == null)
		{
			if(image == null)
			{
				image = (BufferedImage)this.createImage(this.getWidth(),this.getHeight());
			}
			Graphics2D g2 = image.createGraphics();
			g2.setColor(Color.white);
		    g2.fillRect(0, 0, this.getWidth(),this.getHeight());
			for(Figure i : figures)
			{
	//			i.draw(g2d);
				i.draw(g2);
			}
			g2d.drawImage(image, 0, 0, this);
		}
		else
		{
			Graphics2D g2 = image2.createGraphics();
			for(Figure i : figures)
			{
	//			i.draw(g2d);
				i.draw(g2);
			}
			g2d.drawImage(image2, 0, 0, this);
		}
	}
	

}
