package lab6;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Pencil extends Figure{

	public Pencil() {
		super();
	}

	
	public void draw(Graphics2D g2d) { 
        for (int i = 0; i < xList.size() - 1; ++i) 
        {
        	g2d.setColor(Color.white);
            g2d.drawLine(xList.get(i), yList.get(i), xList.get(i + 1), yList.get(i + 1));
        }
     }
	
}
