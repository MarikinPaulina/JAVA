package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class MyGlassPanel extends JComponent  {
//	implements KeyListener
	public MyGlassPanel(GamePanel gameP) {
//		this.setBackground(new Color(50,50,50,50));
		this.setBackground(Color.black);
		KeyListener glassListener = new KeyListener() {

			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {
				int key = e.getKeyCode();
				setVisible(KeyEvent.getKeyText(key) == "VK_ESCAPE");
				System.out.println(KeyEvent.getKeyText(key));
			}

		};
		GamePanel gamePanel = this.gameP;
//		gamePanel.addKeyListener(glassListener);
	}

//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub

//	}
//
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void keyReleased(KeyEvent e) {
//		int key = e.getKeyCode();
//		setVisible(KeyEvent.getKeyText(key) == "VK_ESCAPE");
//		System.out.println(KeyEvent.getKeyText(key));
//

	JButton loadB = new JButton("Kontynuj");
	JButton resetB = new JButton("Reset");
	JButton newB = new JButton("Nowa gra");
	JButton optionsB = new JButton("Opcje");
	JButton exitB = new JButton("Wyjście");
	GamePanel gameP;

}