package OrsonPDF;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.data.xy.XYSeriesCollection;


public class PDFFrame extends JFrame {

	public PDFFrame() throws HeadlessException {
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(794, 1123);
		final PDFFrame frame = this;
		XYSeriesCollection dataset = new XYSeriesCollection();
		
		Plot sin = new Plot();
		sin.sin(dataset);
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content,BoxLayout.X_AXIS));
//		JPanel xPanel = new JPanel(new GridLayout(sin.n,1));
//		JPanel yPanel= new JPanel(new GridLayout(sin.n,1));
//		content.add(xPanel,BorderLayout.WEST);
//		content.add(yPanel,BorderLayout.EAST);
		
		String xString = "<html>";
		String yString = "<html>";
        for(int i =0; i<sin.n/10; i++)
        {
        	xString += (Double.toString(sin.x.get(i)) + "<br/>");
        	yString += (Double.toString(sin.y.get(i)) + "<br/>");
        }
        xString += "</html>";
    	yString += "</html>";
        content.add(new JLabel(xString),BorderLayout.WEST);
        content.add(new JLabel(yString),BorderLayout.EAST);
        frame.setContentPane(content);
	}

	public PDFFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public PDFFrame(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public PDFFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

}
