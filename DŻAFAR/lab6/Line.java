package lab6;

import java.awt.Graphics2D;

public class Line extends Figure {

	public Line() {
		super();
	}

	@Override
	public void draw(Graphics2D g2d) {
		for (int i = 0; i < xList.size() - 2; i+=2) 
        {
           g2d.drawLine(xList.get(i), yList.get(i), xList.get(i + 1), yList.get(i + 1));
        }

	}

}
