package lab6;

import java.awt.Color;
import java.awt.Graphics2D;

public class Eraser extends Figure {

	public Eraser(DrawingPanel panel) {
		super(panel);
	}

	@Override
	public void draw(Graphics2D g2d) {
		for (int i = 0; i < xList.size(); ++i) 
        {
			g2d.setColor(Color.white);
            g2d.fillRect(xList.get(i), yList.get(i), 4, 4);
        }

	}

}
