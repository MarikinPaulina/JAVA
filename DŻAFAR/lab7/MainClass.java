package lab7;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import javax.swing.*;

public class MainClass extends JFrame {

	public MainClass() throws HeadlessException {
//		Przygotowanie okna
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(880,660);
		final MainClass frame = this;
//		Komponenty
		this.add(panel);
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

	static ColorfulPanel panel = new ColorfulPanel();
	
	
	public static void main(String[] args) {
		MainClass frame = new MainClass();
		frame.setVisible(true);
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
		final ScheduledFuture<?> sc1 = scheduler.scheduleAtFixedRate(panel, 1, (long) Math.pow(10, 12), MILLISECONDS);
//		scheduler.shutdown();
	}

}
