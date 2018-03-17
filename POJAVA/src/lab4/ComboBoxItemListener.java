package lab4;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ComboBoxItemListener implements ItemListener {

	mainClass frame;
	
	public ComboBoxItemListener(mainClass frame) {
		this.frame = frame;
	}
	int i;
	JPanel panelek;
	
	public void itemStateChanged(ItemEvent arg0) {
	
		if(arg0.getStateChange()==ItemEvent.SELECTED) {
			String size = (String)arg0.getItem();
//			i = Integer.parseInt(frame.panelowy.getText()) -1;
			panelek = frame.drawPanel;//frame.panelki[i];
			  switch(size) {
			  	  case "czarny":
				      panelek.setBackground(Color.black);
			  		  break;
			  	  case "niebieski":
					 panelek.setBackground(Color.blue);
			  		  break;
			  	  case "czerwony":
					 panelek.setBackground(Color.red);
			  		  break;
			  	  case "cyjan":
					  panelek.setBackground(Color.cyan);
			  		  break;
			  	  case "ciemnoszary":
					  panelek.setBackground(Color.darkGray);
			  		  break;
			  	  case "szary":
					  panelek.setBackground(Color.gray);
			  		  break;
			   	  case "zielony":
					  panelek.setBackground(Color.green);
			  		  break;
			   	  case "magenta":
					  panelek.setBackground(Color.magenta);
			  		  break;
			   	  case "pomarańczowy":
					  panelek.setBackground(Color.orange);
			  		  break;
			  }
		}
	}

}