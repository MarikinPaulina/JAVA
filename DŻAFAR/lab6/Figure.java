package lab6;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public abstract class Figure {

	public Figure(DrawingPanel panel) {
		xList = new ArrayList<Integer>();
        yList = new ArrayList<Integer>();
        this.panel = panel;
	}
	
	public void addPoint(int x, int y) {
        xList.add(x);
        yList.add(y);
     }
	
	public abstract void draw(Graphics2D g2d);

	 protected List<Integer> xList;
     protected List<Integer> yList;
     DrawingPanel panel;
}
