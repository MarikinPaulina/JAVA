package lab2;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class ThreeButtonFrame extends JFrame 
{
	Random r = new Random();
	JPanel panel = new JPanel();
	
	public ThreeButtonFrame() throws HeadlessException {
		this.setSize(640,480);
		
		panel.setLayout(new GridLayout(7,1));
		this.add(panel);
		JButton exitButton = new JButton("Zakończ");
		ActionListener exitListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);		
			}

		};
		exitButton.addActionListener(exitListener);
		
		JButton title = new JButton("Nowy tytuł");
		ActionListener titleListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				ThreeButtonFrame.this.setTitle("Nowy tytuł");
			}

		};
		title.addActionListener(titleListener);
		
		JButton back = new JButton("Nowe tło");
		ActionListener backListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
				panel.setBackground(c1);
			}

		};
		back.addActionListener(backListener);
		
		panel.add(exitButton);
		panel.add(title);
		panel.add(back);
		
    }
    public ThreeButtonFrame(GraphicsConfiguration gc) {
        super(gc);
        this.setSize(640,480);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public ThreeButtonFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(640,480);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public ThreeButtonFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
        this.setSize(640,480);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
	
	public static void main(String[] args) 
	{
		ThreeButtonFrame frame = new ThreeButtonFrame();
		frame.setVisible(true);

	}

}
