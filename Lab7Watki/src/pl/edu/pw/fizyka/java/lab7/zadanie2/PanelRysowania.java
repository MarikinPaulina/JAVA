package pl.edu.pw.fizyka.java.lab7.zadanie2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class PanelRysowania extends JPanel implements Runnable{

	private static final long serialVersionUID = 1L;
	List<Prostokat> prostakaty = new ArrayList<Prostokat>();
//	File[] file = new File()[5];
//	file[0] = ("Łobrazki/obrazek0");

	public PanelRysowania() {
       // domyslny konstruktor
	}
	
	public void dodajLosowyProstokat(){
		Random r = new Random();
		
		Prostokat p = new Prostokat();
		p.setX(r.nextInt(550));
		p.setY(r.nextInt(550));
		p.setWidth(r.nextInt(80));
		p.setHeight(r.nextInt(80));
		p.setColor(new Color(r.nextInt(255), r.nextInt(255),
				r.nextInt(255), r.nextInt(255)));
		p.vx = r.nextInt(10);
		p.vy = r.nextInt(10);

		prostakaty.add(p);
	}
	
	public void dodajProstokat(int x, int y, int width, int height, Color c){;
		Prostokat p = new Prostokat();
		p.setX(x);
		p.setY(y);
		p.setWidth(width);
		p.setHeight(height);
		p.setColor(c);;

		prostakaty.add(p);		
		
	}

	public void dodajŁobrazek(String zrodlo,Prostokat p) 
	{
		URL resource = getClass().getResource(zrodlo);
		try {
		p.image = ImageIO.read(resource);
		} catch (IOException e) {
		System.err.println("Blad odczytu obrazka");
		e.printStackTrace();
		}
		p.setHeight(p.image.getHeight());
		p.setWidth(p.image.getWidth());
	}
	
	
	public void boundaryConditions(Prostokat p)
	{
		if(p.getX() < 0 || (p.getX() + p.getWidth()) > this.getWidth())
		{
			p.vx = -p.vx;
		}
		if(p.getY() < 0 || (p.getY() + p.getHeight()) > this.getHeight())
		{
			p.vy = -p.vy;
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (Prostokat pr : prostakaty) {
			pr.paint(g);
		}

	}
	
	public Dimension getPreferredSize() {
		return new Dimension(600, 600);
	}

	public void run() {
		for(Prostokat p : prostakaty)
		{
			p.setX(p.getX() + p.vx);
			p.setY(p.getY() + p.vy);
			boundaryConditions(p);
		}
		repaint();
	}
}
