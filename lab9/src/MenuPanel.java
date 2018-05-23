import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class MenuPanel extends JPanel {

	JButton sinB = new JButton("sin");
	JButton cosB = new JButton("cos");
	JButton xB = new JButton("x");
	JButton x2B = new JButton("x^2");
	JButton lnB = new JButton("ln");
	Frame frame;
	
	public MenuPanel(final Frame frame) {
		this.frame = frame;
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		this.add(sinB);
		this.add(cosB);
		this.add(xB);
		this.add(x2B);
		this.add(lnB);
		
		
		ActionListener sinLis = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Plot plot = new Plot(frame);
				plot.sin();
			}

		};
		sinB.addActionListener(sinLis);
		
		ActionListener cosLis = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Plot plot = new Plot(frame);
				plot.cos();
			}
		};
		cosB.addActionListener(cosLis);
		
		ActionListener xLis = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Plot plot = new Plot(frame);
				plot.x();
			}

		};
		xB.addActionListener(xLis);
		
		ActionListener x2Lis = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Plot plot = new Plot(frame);
				plot.x2();
			}

		};
		x2B.addActionListener(x2Lis);
		
		ActionListener lnLis = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Plot plot = new Plot(frame);
				plot.ln();
			}

		};
		lnB.addActionListener(lnLis);
	}

	public MenuPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public MenuPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MenuPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

		

	
}
