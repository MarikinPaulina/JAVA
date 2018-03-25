package lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainClass extends JFrame {

	public MainClass() throws HeadlessException 
	{
//		Przygotowanie okna
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(880,660);
		final MainClass frame = this;
//		Ustawienie Layoutów
		frame.add(drawP,BorderLayout.CENTER);
		drawP.setBackground(Color.black);
		frame.add(upMenuP,BorderLayout.NORTH);
		sideMenuP.setLayout(new BoxLayout(sideMenuP,BoxLayout.Y_AXIS));
		frame.add(sideMenuP,BorderLayout.WEST);
//		Ustawienie komponentów
//		Radio button do wyboru kształtu
		group.add(pencilB);
		group.add(lineB);
		group.add(eraserB);
		group.add(squareB);
		group.add(fullSquareB);
		upMenuP.add(pencilB);
		upMenuP.add(lineB);
		upMenuP.add(eraserB);
		upMenuP.add(squareB);
		upMenuP.add(fullSquareB);
//		Slider do wyboru grubości
		sideMenuP.add(thickS);
//		Przyciski do czyszczenia i wyboru koloru
		sideMenuP.add(colorB);
		sideMenuP.add(cleanB);

//		Listenery do komponentów
		pencilB.addActionListener(new radioListener());
		lineB.addActionListener(new radioListener());
		eraserB.addActionListener(new radioListener());
		squareB.addActionListener(new radioListener());
		fullSquareB.addActionListener(new radioListener());
		
	}

	public MainClass(GraphicsConfiguration gc) {
		super(gc);
	}

	public MainClass(String title) throws HeadlessException {
		super(title);
	}

	public MainClass(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

	public class radioListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			 String g=  ((JRadioButton) e.getSource()).getText();
			 switch(g){
			 	case "Ołówek":
			 		shape = "Ołówek";
			 		break;
			 	case "Linia":
			 		shape = "Linia";
			 		break;
			 	case "Gumka":
			 		shape = "Gumka";
			 		break;
			 	case "Kwadrat":
			 		shape = "Kwadrat";
			 		break;
			 	case "Wypełniony Kwadrat":
			 		shape = "Wypełniony Kwadrat";
			 		break;
			 }
				 
					 
		  }
	}
	
//	Ogólne dane
	Dimension size = this.getSize();
//	panele
	DrawingPanel drawP = new DrawingPanel(this);
	JPanel upMenuP = new JPanel();
	JPanel sideMenuP = new JPanel();
//	komponenty
//	Radio button do wyboru kształtu
	ButtonGroup group = new ButtonGroup();
	JRadioButton pencilB = new JRadioButton("Ołówek",true);
	JRadioButton lineB = new JRadioButton("Linia",false);
	JRadioButton eraserB = new JRadioButton("Gumka",false);
	JRadioButton squareB = new JRadioButton("Kwadrat",false);
	JRadioButton fullSquareB = new JRadioButton("Wypełniony kwadrat",false);
	String shape = "Ołówek";
	
//	Przyciski do czyszczenia i wyboru koloru
	JButton cleanB = new JButton("Wyczyść");
	JButton colorB = new JButton("Kolor linii");
//	cleanB.set
//	Slider do wyboru grubości
	JSlider thickS = new JSlider(SwingConstants.VERTICAL,1,50,1);

	public static void main(String[] args) {
		MainClass frame = new MainClass();
		frame.setVisible(true);
	}

}
