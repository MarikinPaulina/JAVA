import java.util.ArrayList;

import org.jfree.data.xy.XYSeries;


public class Plot {

	ArrayList<Double> x = new ArrayList<Double>();
	ArrayList<Double> y = new ArrayList<Double>();
	int n = 500;
	double dt = 0.1;
	Frame frame;
	public Plot(Frame frame) {
		this.frame = frame;
		for (int i =0; i<n; i++)
		{
			x.add(i*dt);
		}
	}
	
	public void sin()
	{
			XYSeries series = new XYSeries("sin");
			for (int i =0; i<n; i++){
				y.add(Math.sin(x.get(i)));
				series.add(x.get(i), y.get(i));
			}
			frame.dataset.addSeries(series);
	}
	
	public void cos()
	{
		XYSeries series = new XYSeries("cos");
		for (int i =0; i<n; i++){
			y.add(Math.cos(x.get(i)));
			series.add(x.get(i), y.get(i));
		}
		frame.dataset.addSeries(series);
	}
	
	public void x()
	{
		XYSeries series = new XYSeries("x");
		for (int i =0; i<n; i++){
			y.add(x.get(i));
			series.add(x.get(i), y.get(i));
		}
		frame.dataset.addSeries(series);
	}
	
	public void x2()
	{
		XYSeries series = new XYSeries("x2");
		for (int i =0; i<n; i++){
			y.add(Math.pow(x.get(i),2));
			series.add(x.get(i), y.get(i));
		}
		frame.dataset.addSeries(series);
	}
	
	public void ln()
	{
		XYSeries series = new XYSeries("ln");
		for (int i =0; i<n; i++){
			if (x.get(i)==0) y.add(-100.0);
			else y.add(Math.log(x.get(i)));
			series.add(x.get(i), y.get(i));
			System.out.println(y.get(i));
		}
		frame.dataset.addSeries(series);
	}

}
