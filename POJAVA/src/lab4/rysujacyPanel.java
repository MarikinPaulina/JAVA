package lab4;

import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class rysujacyPanel extends JPanel {

	public rysujacyPanel() {
		this.frame = frame;
	}

	public rysujacyPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public rysujacyPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public rysujacyPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(frame.c1);
		if(frame.figura == "kolo")
		{
		 	g.fillOval(20, 20, 20, 20);
		}
		if(frame.figura == "prostokat")
		{
			g.fillRect(20, 20, 20, 20);
		}
	
			

	 	
	 	int[] xPoints = {12,24,12};
	 	int[] yPoints = {70,30,50};
	 	g.fillPolygon(xPoints, yPoints, 3);
	}
	
	mainClass frame;
}
