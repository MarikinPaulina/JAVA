package lab3;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiListenerFrame extends JFrame {

	public MultiListenerFrame() throws HeadlessException {
		this.setSize(640,480);
		
		panel.setLayout(new GridLayout(7,1));
		this.add(panel);
		JButton back = new JButton("Nowe tło");
		ActionListener backListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
				panel.setBackground(c1);
			}

		};
		back.addActionListener(backListener);
		
		panel.add(back);
	}

	public MultiListenerFrame(GraphicsConfiguration gc) {
		super(gc);
		this.setSize(640,480);
		
		panel.setLayout(new GridLayout(7,1));
		this.add(panel);
		JButton back = new JButton("Nowe tło");
		ActionListener backListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
				panel.setBackground(c1);
			}

		};
		back.addActionListener(backListener);
		
		panel.add(back);
	}

	public MultiListenerFrame(String title) throws HeadlessException {
		super(title);
		this.setSize(640,480);
		
		panel.setLayout(new GridLayout(7,1));
		this.add(panel);
		JButton back = new JButton("Nowe tło");
		ActionListener backListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
				panel.setBackground(c1);
			}

		};
		back.addActionListener(backListener);
		
		panel.add(back);
	}

	public MultiListenerFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		this.setSize(640,480);
		
		panel.setLayout(new GridLayout(7,1));
		this.add(panel);
		JButton back = new JButton("Nowe tło");
		ActionListener backListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
				panel.setBackground(c1);
			}

		};
		back.addActionListener(backListener);
		
		panel.add(back);
	}

	Random r = new Random();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		MultiListenerFrame frame = new MultiListenerFrame();
		frame.setVisible(true);

	}

}
