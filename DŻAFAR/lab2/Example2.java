package lab2;

import javax.swing.JButton;
import java.awt.BorderLayout;

public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CloseableFrame frame = new CloseableFrame();
		
		JButton button1 = new JButton("Przycisk 1");
		frame.add(button1, BorderLayout.PAGE_START);
				
		JButton button2 = new JButton("Przycisk 2");
		frame.add(button2, BorderLayout.PAGE_END);

		frame.setVisible(true);

	}

}
