package Interface;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class OptionsPanel extends JPanel {

	public OptionsPanel() {
		
	}

	public OptionsPanel(LayoutManager layout) {
		super(layout);
		this.setBackground(Color.black);
	}

	public OptionsPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public OptionsPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
