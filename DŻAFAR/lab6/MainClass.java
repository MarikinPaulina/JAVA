package lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainClass extends JFrame {

	public MainClass() throws HeadlessException 
	{
//		Przygotowanie okna
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(880,660);
		final MainClass frame = this;
//		Ustawienie Layoutów
		frame.add(drawP,BorderLayout.CENTER);
		drawP.setBackground(Color.white);
		upMenuP.setLayout(new BoxLayout(upMenuP,BoxLayout.X_AXIS));
		frame.add(upMenuP,BorderLayout.NORTH);
		sideMenuP.setLayout(new BoxLayout(sideMenuP,BoxLayout.Y_AXIS));
		frame.add(sideMenuP,BorderLayout.WEST);
//		Ustawienie komponentów
//		Radio button do wyboru kształtu
		group.add(pencilB);
		group.add(lineB);
		group.add(eraserB);
		group.add(rectangleB);
		group.add(fullRectangleB);
		upMenuP.add(pencilB);
		upMenuP.add(lineB);
		upMenuP.add(eraserB);
		upMenuP.add(rectangleB);
		upMenuP.add(fullRectangleB);
//		Slider do wyboru grubości
		sideMenuP.add(thickS);
		thickS.addChangeListener(new SliderChangeListener());
//		Przyciski do czyszczenia i wyboru koloru
		sideMenuP.add(colorB);
		sideMenuP.add(cleanB);
		
//		I  listenery do nich
		ActionListener colorListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				color = JColorChooser.showDialog(null, "Wybierz kolor", color);
			}

		};
		colorB.addActionListener(colorListener);
		ActionListener cleanListener = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				drawP.figures.clear();
				drawP.image2 = null;
				repaint();
			}

		};
		cleanB.addActionListener(cleanListener);

//		Listenery do RButtonow
		pencilB.addActionListener(new radioListener());
		lineB.addActionListener(new radioListener());
		eraserB.addActionListener(new radioListener());
		rectangleB.addActionListener(new radioListener());
		fullRectangleB.addActionListener(new radioListener());
//		Zapis w wczytywanie - komponenty
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu options = new JMenu("Opcje");
		menuBar.add(options);
		JMenuItem save = new JMenuItem("Zapisz");
		options.add(save);
		JMenuItem load = new JMenuItem("Wczytaj");
		options.add(load);
//		Zapis i wczytywanie - filechooser
		chooser.setFileFilter(filter);
//		Zapis i wczytywanie - listenery
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				chooser.showOpenDialog(null);
				File file = chooser.getSelectedFile();
			try {
				if(drawP.image2 == null)
				{
					ImageIO.write(drawP.image, "png", file);
				}
				else
				{
					ImageIO.write(drawP.image2, "png", file);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			}});
		load.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				chooser.showOpenDialog(null);
				File file = chooser.getSelectedFile();
				try {
				drawP.image2 = ImageIO.read(file);
				} catch (IOException e) {
				System.err.println("Blad odczytu obrazka");
				e.printStackTrace();
				}
				drawP.repaint();
			}});
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
			 	case "Prostokąt":
			 		shape = "Prostokąt";
			 		break;
			 	case "Wypełniony Prostokąt":
			 		shape = "Wypełniony Prostokąt";
			 		break;
			 }
				 
					 
		  }
	}
	
	public class SliderChangeListener implements ChangeListener{
		
		public void stateChanged(ChangeEvent arg0) {
			thickInt = thickS.getValue();
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
	JRadioButton rectangleB = new JRadioButton("Prostokąt",false);
	JRadioButton fullRectangleB = new JRadioButton("Wypełniony Prostokąt",false);
	String shape = "Ołówek";
	
//	Przyciski do czyszczenia i wyboru koloru(z ColorChoser)
	JButton cleanB = new JButton("Wyczyść");
	JButton colorB = new JButton("Kolor linii");
	Color color = Color.black;
//	cleanB.set
//	Slider do wyboru grubości
	JSlider thickS = new JSlider(SwingConstants.VERTICAL,1,50,1);
	int thickInt = 1; 
//	Zapisywanie i wczytywanie
	JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "gif", "png");

	public static void main(String[] args) {
		MainClass frame = new MainClass();
		frame.setVisible(true);
	}

}
