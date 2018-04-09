package lab7;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class ColorfulPanel extends JPanel implements Runnable {

	public ColorfulPanel() {
		// TODO Auto-generated constructor stub
	}

	public ColorfulPanel(LayoutManager layout) {
		super(layout);
	}

	public ColorfulPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	public ColorfulPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

	@Override
	public void run() {
		int i = 0;
		while(true)
		{
			panelColor = new Color(i);
			this.setBackground(panelColor);
			i += 1;
		}

	}

	Color panelColor;
	
}
