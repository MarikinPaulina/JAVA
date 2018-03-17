package lab3;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JPanel;

public class ComboBoxItemListener implements ItemListener {

	MultiListenerFrame frame;
	
	public ComboBoxItemListener(MultiListenerFrame frame) {
		this.frame = frame;
	}

	public void itemStateChanged(ItemEvent arg0) {
	
		if(arg0.getStateChange()==ItemEvent.SELECTED) {
			String size = (String)arg0.getItem();
			  switch(size) {
			  	  case "małe okno":
			  		  frame.setSize(320,240);
			  		  break;
			  	  case "średnie okno":
			  		  frame.setSize(640,480);
			  		  break;
			  	  case "duże okno":
			  		  frame.setSize(1280,920);
			  		  break;
			  }
		}
	}


}