package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel implements MouseListener {

	public DrawingPanel(MainClass frame) {
		this.frame = frame;
		this.addMouseListener(this);
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
	int counter = -1;
	ArrayList<Figure> figures = new ArrayList<Figure>();
	@Override
	public void mouseClicked(MouseEvent e) {
		if (frame.shape == "Ołówek" || frame.shape == "Gumka")
		{
			System.out.println("Dodał punkt");
			figures.get(figures.size()-1).addPoint(e.getX(), e.getY());
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (frame.shape == "Ołówek")
		{
			Pencil figure = new Pencil();
			figure.addPoint(e.getX(), e.getY());
			System.out.println("Dodał figurę");
			figures.add(figure);
		}
		else if (frame.shape == "Linia")
		{
			Line figure = new Line();
			figure.addPoint(e.getX(), e.getY());
			figures.add(figure);
		}
		else if (frame.shape == "Gumka")
		{
			Eraser figure = new Eraser();
			figure.addPoint(e.getX(), e.getY());
			figures.add(figure);
		}
		else if (frame.shape == "Prostokąt")
		{
			Rectangle figure = new Rectangle();
			figure.addPoint(e.getX(), e.getY());
			figures.add(figure);
		}
		else
		{
			FullRectangle figure = new FullRectangle();
			figure.addPoint(e.getX(), e.getY());
			figures.add(figure);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (frame.shape == "Linia" || frame.shape == "Prostokąt" || frame.shape == "Wypełniony Prostokąt")
		{
			figures.get(figures.size()-1).addPoint(e.getX(), e.getY());
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponent(Graphics2D g2d)
	{
		for(Figure i : figures)
		{
			i.draw(g2d);
		}
	}
}
