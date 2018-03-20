package Interface;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class InitPanel extends JPanel {

	public InitPanel() {
		// TODO Auto-generated constructor stub
	}

	public InitPanel(LayoutManager layout) {
		super(layout);
		this.setBackground(Color.gray);
	}

	public InitPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public InitPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
