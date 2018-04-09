package lab7;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass extends JFrame implements Runnable{

	public MainClass() throws HeadlessException {
//		Przygotowanie okna
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(640,480);
//		Komponenty
		this.add(panel);
		panel.add(button);
	}

	public MainClass(GraphicsConfiguration arg0) {
		super(arg0);
	}

	public MainClass(String arg0) throws HeadlessException {
		super(arg0);
	}

	public MainClass(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
	}

	@Override
	public void run() {
		this.setBounds(x0, y0, x1, y1);
		x0 += jx;
		y0 += jy;
		if (x0 < 0 || x0 + this.getWidth() > screenSize.width)
		{
			jx = -jx;
		}
		if (y0 < 0 || y0 + this.getHeight() > screenSize.height)
		{
			jy = -jy;
		}
	}
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	ColorPanel panel = new ColorPanel();
	AnimatedButton button = new AnimatedButton();
	int x0 = 0;
	int x1 = 640;
	int y0 = 0;
	int y1 = 480;
	int jx = 2;
	int jy = 2;
	Close exit = new Close();

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainClass frame = new MainClass();
				frame.setVisible(true);
				final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(4);
				final ScheduledFuture<?> sc1 = scheduler.scheduleAtFixedRate(frame.panel, 0, 10, TimeUnit.MILLISECONDS);
				final ScheduledFuture<?> sc2 = scheduler.scheduleAtFixedRate(frame.button, 1, 1, TimeUnit.SECONDS);
				final ScheduledFuture<?> sc3 = scheduler.scheduleAtFixedRate(frame, 1, 50, TimeUnit.MILLISECONDS);
				final ScheduledFuture<?> sc4 = scheduler.scheduleAtFixedRate(frame.exit, 20, 20, TimeUnit.SECONDS);
			}
		});

	}

}
