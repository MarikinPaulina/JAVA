package lab7;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class ColorPanel extends JPanel implements Runnable {

	public ColorPanel() {
	}

	public ColorPanel(LayoutManager arg0) {
		super(arg0);
	}

	public ColorPanel(boolean arg0) {
		super(arg0);
	}

	public ColorPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
	}

	Color kolor;
	int i = 0;
	
	@Override
	public void run() {
		kolor = new Color(i);
		this.setBackground(kolor);
		i += 5;
	}

}
