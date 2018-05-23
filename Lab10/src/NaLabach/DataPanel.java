package NaLabach;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DataPanel extends JPanel {
	

	public DataPanel(MainFrame frame) {
		this.add(frame.textA);
		frame.textA.setSize(this.getWidth(), this.getHeight());
	}

	public DataPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public DataPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public DataPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
