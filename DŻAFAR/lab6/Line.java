package lab6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Line extends Figure {

	public Line(DrawingPanel panel) {
		super(panel);
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setStroke(bs1);
		g2d.setColor(color);
		for (int i = 0; i < xList.size() - 1; i+=2) 
        {
            g2d.drawLine(xList.get(i), yList.get(i), xList.get(i + 1), yList.get(i + 1));
        }

	}
	BasicStroke bs1 = new BasicStroke(panel.frame.thickInt);
	Color color = panel.frame.color;
}
