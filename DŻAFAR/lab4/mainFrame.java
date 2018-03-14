package lab4;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class mainFrame extends JFrame {

	public mainFrame() throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(640,480);
		
		this.add(menu);
	}

	public mainFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public mainFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public mainFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	interfacePanel menu = new interfacePanel();
	drawPanel canva = new drawPanel(new GridLayout(3,3));

	public static void main(String[] args) {
		mainFrame frame = new mainFrame();
		frame.setVisible(true);

	}

}
