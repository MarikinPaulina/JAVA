package lab4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class rysujacyPanel extends JPanel {

	public rysujacyPanel(mainClass frame) {
		this.frame = frame;
	}

	public rysujacyPanel(LayoutManager layout,mainClass frame) {
		super(layout);
		this.frame = frame;
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
		Graphics2D g2d = (Graphics2D) g;
		BasicStroke bs1 = new BasicStroke(frame.grubosc);
		g2d.setStroke(bs1);
		Color kolor = frame.kolor;
		g2d.setColor(kolor);
		int n = Integer.parseInt(frame.wierzcholki.getText());
		Dimension xy = getSize();
        int xmax = xy.width;
        int ymax = xy.height;
		xPoints = new ArrayList<Integer>();
		yPoints = new ArrayList<Integer>();
		
	 	for (int i =0; i<n; i++)
	 	{
	 		xPoints.add(r.nextInt(xmax));
	 		yPoints.add(r.nextInt(ymax));
	 	}
		
	 	g2d.drawPolygon(convertIntegers(xPoints), convertIntegers(yPoints), n);
	}
	
	public static int[] convertIntegers(ArrayList<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    for (int i=0; i < ret.length; i++)
	    {
	        ret[i] = integers.get(i).intValue();
	    }
	    return ret;
	}
	
	Random r = new Random();
	mainClass frame;
	ArrayList<Integer> xPoints;
	ArrayList<Integer> yPoints;
	
}
