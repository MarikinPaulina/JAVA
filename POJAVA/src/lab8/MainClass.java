package lab8;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import lab4.mainClass;

public class MainClass extends JFrame {

	public MainClass() throws HeadlessException {
//		Ustawienia frame'a
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(880,660);
		MainClass frame = this;
//		Panele
		frame.add(menu, BorderLayout.NORTH);
		frame.add(textPanel, BorderLayout.CENTER);
	}

	public MainClass(GraphicsConfiguration arg0) {
		super(arg0);
	}

	public MainClass(String arg0) throws HeadlessException {
		super(arg0);
	}

	public MainClass(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
	}

	MenuPanel menu = new MenuPanel(this);
	TextPanel textPanel = new TextPanel(this);

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				MainClass frame = new MainClass();
				frame.setVisible(true);
				
			}
		});
	};

}
