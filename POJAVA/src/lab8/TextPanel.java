package lab8;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextPanel extends JPanel {

	public TextPanel(MainClass frame) {
		this.frame = frame;
		this.add(textField);
		textField.setPreferredSize(new Dimension(800,600));
	}

	public TextPanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public TextPanel(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public TextPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public void changeText(String sO, String sM){
		originalS = sO;
		modifiedS = sM;
		textField.setText(modifiedS);
	}
	
	public boolean checkText(String s1, String s2){
		StringTokenizer t1 = new StringTokenizer(s1);
		StringTokenizer t2 = new StringTokenizer(s2);
		if (t1.countTokens() != t2.countTokens())
		{
			System.out.println("Różna długość");
			return false;
		}
		for(int i=0; i < t1.countTokens() ; i++) {
			if (t1.nextToken() != t2.nextToken());
			{
				System.out.println("Różny tekst");
				return false;
			}
		}
		System.out.println("Jest ok");
		return true;
	}
	
	JTextArea textField = new JTextArea();
	MainClass frame;
	String modifiedS;
	String originalS;
		
}
