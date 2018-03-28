package lab6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends Figure {

	public Rectangle(DrawingPanel panel) {
		super(panel);
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setStroke(bs1);
		g2d.setColor(color);
		for (int i = 0; i < xList.size() - 1; i+=2) 
        {
			int x1 = Math.max(xList.get(i), xList.get(i + 1));
			int y1 = Math.max(yList.get(i), yList.get(i + 1));
			int x0 = Math.min(xList.get(i), xList.get(i + 1));
			int y0 = Math.min(yList.get(i), yList.get(i + 1));
            g2d.drawRect(x0, y0, x1-x0, y1-y0);
        }

	}
	
	BasicStroke bs1 = new BasicStroke(panel.frame.thickInt);
	Color color = panel.frame.color;

}
