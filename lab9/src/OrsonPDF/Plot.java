package OrsonPDF;
import java.util.ArrayList;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Plot {

	ArrayList<Double> x = new ArrayList<Double>();
	ArrayList<Double> y = new ArrayList<Double>();
	int n = 500;
	double dt = 0.1;
	public Plot() {
		for (int i =0; i<n; i++)
		{
			x.add(i*dt);
		}
	}
	
	public void sin(XYSeriesCollection dataset)
	{
			XYSeries series = new XYSeries("sin");
			for (int i =0; i<n; i++){
				y.add(Math.sin(x.get(i)));
				series.add(x.get(i), y.get(i));
			}
			dataset.addSeries(series);
	}
	
	public void cos(XYSeriesCollection dataset)
	{
		XYSeries series = new XYSeries("cos");
		for (int i =0; i<n; i++){
			y.add(Math.cos(x.get(i)));
			series.add(x.get(i), y.get(i));
		}
		dataset.addSeries(series);
	}
	
	public void x(XYSeriesCollection dataset)
	{
		XYSeries series = new XYSeries("x");
		for (int i =0; i<n; i++){
			y.add(x.get(i));
			series.add(x.get(i), y.get(i));
		}
		dataset.addSeries(series);
	}
	
	public void x2(XYSeriesCollection dataset)
	{
		XYSeries series = new XYSeries("x2");
		for (int i =0; i<n; i++){
			y.add(Math.pow(x.get(i),2));
			series.add(x.get(i), y.get(i));
		}
		dataset.addSeries(series);
	}
	
	public void ln(XYSeriesCollection dataset)
	{
		XYSeries series = new XYSeries("ln");
		for (int i =0; i<n; i++){
			if (x.get(i)==0) y.add(-100.0);
			else y.add(Math.log(x.get(i)));
			series.add(x.get(i), y.get(i));
			System.out.println(y.get(i));
		}
		
		dataset.addSeries(series);
	}

}
