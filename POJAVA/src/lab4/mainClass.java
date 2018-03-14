package lab4;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import lab3.ComboBoxItemListener;

public class mainClass extends JFrame {

	public mainClass() throws HeadlessException {
//		Ustawianie paneli i layoutu
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(800,600);
		
		this.add(menuPanel,BorderLayout.NORTH);
		this.add(drawPanel,BorderLayout.CENTER);
		int j = 0;
//		ładne okienka
		for(int i =0; i<9; i++)
		{
			panelki[i] = new JPanel();
			drawPanel.add(panelki[i]);
			panelki[i].setBackground(new Color(j,0,0));
			j +=17;
		}
		

		menuPanel.add(rysujButton);	
		ActionListener rysujListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				int i = Integer.parseInt(panel);
				JPanel panelek = panelki[i];
				
			}

		};
		rysujButton.addActionListener(rysujListener);
//		zmiana koloru linii
		grupa.add(koloRButton);
		ActionListener colorListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Color c1 = new Color(r.nextFloat(),r.nextFloat(),r.nextFloat());
				panelki[8].setBackground(c1);
			}

		};
		colorButton.addActionListener(colorListener);
		
		
		grupa.add(sredniaRButton);
		grupa.add(grubaRButton);
		grupa.add(cienkaRButton)
		menuPanel.add(cienkaRButton);
		menuPanel.add(sredniaRButton);
		menuPanel.add(grubaRButton);
		menuPanel.add(labelPanelowy);
		menuPanel.add(panelowy);
		menuPanel.add(colorButton);
		
		String[] colors = {"czarny", "niebieski", "czerwony", "cyjan", "ciemnoszary", "szary", "zielony", "magenta", "pomarańczowy"};
		JComboBox<String> backColor = new JComboBox<String>(colors);
		menuPanel.add(backColor);
		backColor.addItemListener(new lab4.ComboBoxItemListener(this));
		

		
		
	}

	public mainClass(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public mainClass(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public mainClass(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	JPanel menuPanel = new JPanel();
	JPanel drawPanel = new JPanel(new GridLayout(3,3));
	final JPanel[] panelki = new JPanel[9];
	JButton rysujButton = new JButton("Rysuj!");
	JRadioButton cienkaRButton = new JRadioButton("cienka", true);
	JRadioButton sredniaRButton = new JRadioButton("średnia", false);
	JRadioButton grubaRButton = new JRadioButton("gruba", false);
	JLabel labelPanelowy = new JLabel("panel");
	JTextField panelowy = new JTextField(4);
	JButton colorButton = new JButton("Zmień kolor linii");
	String figura = "kolo";
	ButtonGroup grupa = new ButtonGroup();
	Random r = new Random();
	String color = "czarny";

	
	public static void main(String[] args) {
		mainClass frame = new mainClass();
		frame.setVisible(true);
		

	}

}
