package lab2;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class ThreeShapesPanel extends JPanel
{
	ThreeShapesPanel()
	{
		super();
	}
	Random rand = new Random();
	Color cool1 = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
	Color cool2 = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
	Color cool3 = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.setColor(cool1);
	    g.fillRect(50, 50, 150, 100);
			
		g.setColor(cool2);
	 	g.fillOval(250, 250, 150, 150);
	 	
	 	int xpoints[] = {25, 145, 25, 145, 25};
	    int ypoints[] = {25, 25, 145, 145, 25};
	    int npoints = 5;
	    
	 	g.setColor(cool3);
	 	g.fillPolygon(xpoints, ypoints, npoints);
			
	}
	
	
	
	public static void main(String[] args) {
		CloseableFrame frame = new CloseableFrame();
		ThreeShapesPanel panel1 = new ThreeShapesPanel();
		JPanel panel2 = new JPanel();
		frame.add(panel1);
		
		frame.setVisible(true);

	}

}
