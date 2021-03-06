package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MultiListenerFrame extends JFrame 
{
	

	public MultiListenerFrame() throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(640,480);
		
//		panel.setLayout(new GridLayout(7,1));
		this.add(panel);
		JButton back = new JButton("Nowe tło");
		ActionListener backListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
				panel.setBackground(c1);
			}

		};
		
		back.addActionListener(backListener);
		
		slider = new JSlider(JSlider.HORIZONTAL, -100,100,0);
		this.add(slider, BorderLayout.PAGE_START);
		
		label = new JLabel(String.format("%d", slider.getValue()));
		this.add(label, BorderLayout.WEST);
		
		slider.addChangeListener(new SliderChangeListener());
		
		String[] colors = {"średnie okno","małe okno",  "duże okno"};
		JComboBox<String> sizeList = new JComboBox<String>(colors);
		panel.add(sizeList, BorderLayout.PAGE_START);
		sizeList.addItemListener(new ComboBoxItemListener(this));
		
		this.add(back, BorderLayout.EAST);

		
	}

	public MultiListenerFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public MultiListenerFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public MultiListenerFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	
	public class SliderChangeListener implements ChangeListener{
		
		public void stateChanged(ChangeEvent arg0) {
			String value = String.format("%d", slider.getValue());
			label.setText(value);
		}
		
	}
	
	Random r = new Random();
	JPanel panel = new JPanel();
	JSlider slider;
	JLabel label;
	
	public static void main(String[] args) {
		MultiListenerFrame frame = new MultiListenerFrame();
		frame.setVisible(true);

	}

}
