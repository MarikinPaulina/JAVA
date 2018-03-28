package lab6;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListeningMouse extends MouseAdapter {

	public ListeningMouse(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void mousePressed(MouseEvent e) {
		if (panel.frame.shape == "Ołówek")
		{
			Pencil figure = new Pencil(panel);
			figure.addPoint(e.getX(), e.getY());
			panel.figures.add(figure);
		}
		else if (panel.frame.shape == "Linia")
		{
			Line figure = new Line(panel);
			figure.addPoint(e.getX(), e.getY());
			panel.figures.add(figure);
			System.out.println("Dodał figurę");
		}
		else if (panel.frame.shape == "Gumka")
		{
			Eraser figure = new Eraser(panel);
			figure.addPoint(e.getX(), e.getY());
			panel.figures.add(figure);
		}
		else if (panel.frame.shape == "Prostokąt")
		{
			Rectangle figure = new Rectangle(panel);
			figure.addPoint(e.getX(), e.getY());
			panel.figures.add(figure);
		}
		else
		{
			FullRectangle figure = new FullRectangle(panel);
			figure.addPoint(e.getX(), e.getY());
			panel.figures.add(figure);
			System.out.println("Dodał figurę");
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		if (panel.frame.shape == "Linia" || panel.frame.shape == "Prostokąt" || panel.frame.shape == "Wypełniony Prostokąt")
		{
			System.out.println("Dodał punkt");
			panel.figures.get(panel.figures.size()-1).addPoint(e.getX(), e.getY());
		}
		panel.repaint();
	}

	public void mouseDragged(MouseEvent e)
	{
		if (panel.frame.shape == "Ołówek" || panel.frame.shape == "Gumka")
		{
			panel.figures.get(panel.figures.size()-1).addPoint(e.getX(), e.getY());
		}
		panel.repaint();
	}
	
	DrawingPanel panel;
}
