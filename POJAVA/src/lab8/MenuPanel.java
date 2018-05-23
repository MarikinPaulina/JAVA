package lab8;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {

	public MenuPanel(final MainClass frame) {
		this.frame = frame;
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		this.add(loadB);
		this.add(saveB);
		this.add(checkB);
//		Listenery
		ActionListener loadListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				chooser.showOpenDialog(null);
				File file = chooser.getSelectedFile();
				try {
					FileReader in = new FileReader(file);
					StringWriter outO = new StringWriter();
					StringWriter outM = new StringWriter();
					int c;
					int cLast = 'o';
					while ((c = in.read()) != -1)
						{if (c=='h' || c=='H' || c=='ó' || c=='U' || c=='u' || c=='ż' || c=='Ż') outM.write('?');
						else if(c=='c' || c=='C' || c=='r' || c=='R')
						{
							cLast = c;
						}
						if(((cLast=='c' || cLast=='C') && c=='h') || ((cLast=='r' || cLast=='R') && c=='z'))
							{
							outM.write('?');
							cLast = 'o';
							}
						else if(cLast=='c' || cLast=='C' || cLast=='r' || cLast=='R')
						{
							outM.write(cLast);
							cLast = 'o';
							outM.write(c);
						}
						else outM.write(c);
							outO.write(c);
						}
					in.close();
					frame.textPanel.changeText(outO.toString(),outM.toString());
					outO.close();
					outM.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		};
		
		ActionListener saveListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				chooser.showOpenDialog(null);
				File file = chooser.getSelectedFile();
				frame.textPanel.modifiedS = frame.textPanel.textField.getText();
				StringReader in = new StringReader(frame.textPanel.modifiedS);
				FileWriter out;
				int c;
				try {
					out = new FileWriter(file);
					while ((c = in.read()) != -1) out.write(c);
					in.close();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		};

		ActionListener checkListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				frame.textPanel.modifiedS = frame.textPanel.textField.getText();
				frame.textPanel.checkText(frame.textPanel.originalS, frame.textPanel.modifiedS);
				
			}

		};
//		Dodawanie listenerów
		loadB.addActionListener(loadListener);
		saveB.addActionListener(saveListener);
		checkB.addActionListener(checkListener);
	}

	public MenuPanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MenuPanel(boolean arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MenuPanel(LayoutManager arg0, boolean arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	MainClass frame;
	JButton loadB = new JButton("Wczytaj");
	JButton saveB = new JButton("Zapisz");
	JButton checkB = new JButton("Sprawdź");
	JFileChooser chooser = new JFileChooser();
	TextStyleComboBox textStyle = new TextStyleComboBox(this);

}