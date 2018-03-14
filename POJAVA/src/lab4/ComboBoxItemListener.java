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
			  switch(size) {
			  	  case "czarny":
			  		 i = Integer.parseInt(frame.panelowy.getText()) -1;
					 panelek = frame.panelki[i];
					 panelek.setBackground(Color.black);
			  		  break;
			  	  case "niebieski":
			  		 i = Integer.parseInt(frame.panelowy.getText()) -1;
					 panelek = frame.panelki[i];
					 panelek.setBackground(Color.blue);
			  		  break;
			  	  case "czerwony":
			  		 i = Integer.parseInt(frame.panelowy.getText()) -1;
					 panelek = frame.panelki[i];
					 panelek.setBackground(Color.red);
			  		  break;
			  	  case "cyjan":
			  		  i = Integer.parseInt(frame.panelowy.getText()) -1;
					  panelek = frame.panelki[i];
					  panelek.setBackground(Color.cyan);
			  		  break;
			  	  case "ciemnoszary":
			  	   	  i = Integer.parseInt(frame.panelowy.getText()) -1;
					  panelek = frame.panelki[i];
					  panelek.setBackground(Color.darkGray);
			  		  break;
			  	  case "szary":
			  		  i = Integer.parseInt(frame.panelowy.getText()) -1;
					  panelek = frame.panelki[i];
					  panelek.setBackground(Color.gray);
			  		  break;
			   	  case "zielony":
			   		  i = Integer.parseInt(frame.panelowy.getText()) -1;
					  panelek = frame.panelki[i];
					  panelek.setBackground(Color.green);
			  		  break;
			   	  case "magenta":
			   		  i = Integer.parseInt(frame.panelowy.getText()) -1;
					  panelek = frame.panelki[i];
					  panelek.setBackground(Color.magenta);
			  		  break;
			   	  case "pomarańczowy":
			  		  i = Integer.parseInt(frame.panelowy.getText()) -1;
					  panelek = frame.panelki[i];
					  panelek.setBackground(Color.orange);
			  		  break;
			  }
		}
	}

}