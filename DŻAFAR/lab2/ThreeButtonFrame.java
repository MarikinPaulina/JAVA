package lab2;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class ThreeButtonFrame extends JFrame{

	public ThreeButtonFrame() //throws HeadlessException 
	{
		super();
		this.setSize(640,480);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		ThreeShapesPanel panel = new ThreeShapesPanel();
		JButton button1 = new JButton("Zakończ"); 
		JButton button2 = new JButton("Reset tytułu");
		JButton button3 = new JButton("Przycisk konca swiata"); 
		ActionListener listener1 = new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		};
		ActionListener listener2 = new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		};
		ActionListener listener3 = new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println("Koniec");
				System.exit(2);
			}
		};
		button1.addActionListener(listener1);
		button2.addActionListener(listener2);
		button3.addActionListener(listener3);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		this.setTitle(title);
		this.add(panel);
	}
	
    public static void main(String[] args) 
	{
		ThreeButtonFrame frame = new ThreeButtonFrame();
		frame.setVisible(true);
	    

	}
	Random rand = new Random();
	Color cool1 = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
}
