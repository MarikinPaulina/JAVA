package lab2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ThreeShapesPanel extends JPanel 
{
	Random r = new Random();
	Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
	Color c2 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
	Color c3 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(c1);
	    g.fillRect(50, 50, 150, 100);
			
		g.setColor(c2);
	 	g.fillOval(250, 250, 150, 150);
	 	
	 	int[] xPoints = {12,24,12};
	 	int[] yPoints = {70,30,50};
	 	g.setColor(c3);
	 	g.fillPolygon(xPoints, yPoints, 3);
	}

	
	public static void main(String[] args) 
	{
		
		CloseableFrame frame = new CloseableFrame();
		frame.setLayout(new GridLayout(1,2));
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4,1));
		ThreeShapesPanel panel2 = new ThreeShapesPanel();
		JButton button1 = new JButton("Przycisk 1");
		JLabel Label1 = new JLabel("Napis 1");
		JButton button2 = new JButton("Przycisk 2");
		JLabel Label2 = new JLabel("Napis 2");
		panel1.add(button1);
		panel1.add(Label1);
		panel1.add(button2);
		panel1.add(Label2);
		frame.add(panel1);
		frame.add(panel2);
		frame.setVisible(true);
	}

}
