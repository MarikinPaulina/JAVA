package lab6;

import java.awt.Color;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {

	public DrawingPanel(MainClass frame) {
		
	}

	public DrawingPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public DrawingPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public DrawingPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		
	}

	MainClass frame;
	ArrayList<Figure> figures = new ArrayList<Figure>();
}
