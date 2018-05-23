package NaLabach;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	JTextArea textA = new JTextArea();
	JButton button = new JButton("Connect and run");
	JTextField textF = new JTextField();
	MenuPanel menuP = new MenuPanel(this);
	DataPanel dataP = new DataPanel(this);
	
	
	
	public MainFrame() throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(880,660);
		final MainFrame frame = this;
		
		frame.add(menuP,BorderLayout.NORTH);
		frame.add(dataP,BorderLayout.CENTER);
		dataP.setSize(this.getWidth(), this.getHeight());
	}

	public MainFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public MainFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public MainFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

}
