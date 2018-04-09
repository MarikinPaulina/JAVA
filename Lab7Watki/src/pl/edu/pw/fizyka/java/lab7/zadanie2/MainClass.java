package pl.edu.pw.fizyka.java.lab7.zadanie2;

import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				JFrame f = new JFrame("Prostokaty");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				PanelRysowania panel = new PanelRysowania();
				Gif g = new Gif(panel, 1);
				
				panel.dodajProstokat(100, 100, 80, 160, Color.BLUE);
				
				for (int i = 1; i<20 ; i++) panel.dodajLosowyProstokat();
				
				final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
				final ScheduledFuture<?> sc1 = scheduler.scheduleAtFixedRate(panel, 0, 5, TimeUnit.MILLISECONDS);
				final ScheduledFuture<?> sc2 = scheduler.scheduleAtFixedRate(g, 0, 250, TimeUnit.MILLISECONDS);
				
				f.add(panel);
				f.setSize(600, 600);
				f.setVisible(true);
				
			}
		});

	}

}

