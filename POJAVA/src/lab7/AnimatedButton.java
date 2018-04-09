package lab7;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class AnimatedButton extends JButton implements Runnable {

	String[] tekst = { "And", "he", "keep", "talking", "and","talking","in","one","incredably","long","sentence",
			"moving","from","topic","to","topic","so","that","no","one","had","a","chance","to","stop","him" };
	int i = 0;
	
	public AnimatedButton() {
	}

	public AnimatedButton(Icon arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AnimatedButton(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AnimatedButton(Action arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AnimatedButton(String arg0, Icon arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		if (i < tekst.length - 1)
			i++;
		else
			i = 0;
		setText(tekst[i]);

	}

}
