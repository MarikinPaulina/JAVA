import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class PlotPanel extends JPanel {

	public PlotPanel() {
		// TODO Auto-generated constructor stub
	}

	public PlotPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public PlotPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public PlotPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	String chartTitle = "Plot";
    String xAxisLabel = "X";
    String yAxisLabel = "Y";
	int wykresy = 0;
}
