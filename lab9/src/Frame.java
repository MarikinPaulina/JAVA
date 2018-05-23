import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;


public class Frame extends JFrame {

	MenuPanel mPanel = new MenuPanel(this);
	PlotPanel pPanel = new PlotPanel();
	XYSeriesCollection dataset = new XYSeriesCollection();
	
	public Frame() throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(880,660);
		Frame frame = this;
		
		frame.add(mPanel,BorderLayout.NORTH);
		JFreeChart chart = ChartFactory.createXYLineChart("plot","x", "y", dataset);
		frame.add(new ChartPanel(chart),BorderLayout.CENTER);

		
	}

	public Frame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Frame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Frame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}


	
	public JPanel createChartPanel(XYDataset dataset) {
	    String chartTitle = "Plot";
	    String xAxisLabel = "X";
	    String yAxisLabel = "Y";
	 
	 
	    JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
	            xAxisLabel, yAxisLabel, dataset);
	    
	    return new ChartPanel(chart);
	}
}
