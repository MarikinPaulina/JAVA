package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MedianFrame extends JFrame {

	public MedianFrame() throws HeadlessException 
	{
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(640,480);
		
		JPanel panel = new JPanel();
		this.add(panel);
		
		panel.add(poleTekstowe);
		panel.add(addButton);
		panel.add(medButton);
		panel.add(medLabel);
		panel.add(listLabel);
		
		medLabel.setText(Double.toString(0)+"    ");
		
		ActionListener textListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				lista.add(Double.parseDouble(poleTekstowe.getText()));
				stringListowy += poleTekstowe.getText() + ", ";
				listLabel.setText(stringListowy);
				counter++;
			}

		};
		addButton.addActionListener(textListener);
		
		ActionListener medListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if(counter%2 == 1)
				{
					Collections.sort(lista);
					int indeks = counter/2 ;
					medLabel.setText(Double.toString(lista.get(indeks)));
				}
				if(counter%2 == 0)
				{
					Collections.sort(lista);
					int indeks = counter/2;
					double liczba = (lista.get(indeks)+lista.get(indeks+1))/2;
					medLabel.setText(Double.toString(liczba));
				}
			}

		};
		medButton.addActionListener(medListener);
		
	}

	public MedianFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public MedianFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public MedianFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	int counter = 0;
	ArrayList<Double> lista = new ArrayList<Double>();
	JTextField poleTekstowe = new JTextField(7);
	JButton addButton = new JButton("Dodaj");
	JButton medButton = new JButton("Mediana");
	JLabel medLabel = new JLabel();
	JLabel listLabel = new JLabel();
	String stringListowy = "";
	
	
	public static void main(String[] args) {
		MedianFrame frame = new MedianFrame();
		frame.setVisible(true);
		

	}

}
