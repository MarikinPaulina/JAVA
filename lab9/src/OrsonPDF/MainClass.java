package OrsonPDF;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;

import com.orsonpdf.PDFDocument;
import com.orsonpdf.PDFGraphics2D;
import com.orsonpdf.Page;

public class MainClass {

	static Random r = new Random();
	
	public MainClass() {
		
	}
	
	public static void main(String[] args) {
		// Tworzenie nowej klasy reprezentujacej dokument PDF
        PDFDocument pdfDoc = new PDFDocument();
        // opcjonalne ustawianie tytulu i autora PDF:
        pdfDoc.setTitle("Laboratorium 9 \n zadanie 2");
        pdfDoc.setAuthor("Paulina Marikin");
        
        // dodawanie nowej strony do klasy reprezentujacej PDF
        Page plotPage = pdfDoc.createPage(new Rectangle(794, 1123));
        Page dataPage = pdfDoc.createPage(new Rectangle(794, 1123));
        Page imagePage = pdfDoc.createPage(new Rectangle(794, 1123));
        // 794px x 1123px odpowiada mniej wiecej A4 z rozdzielczoscia 96 dpi 
        
        PDFGraphics2D g2Plot = plotPage.getGraphics2D();
        PDFGraphics2D g2Data = dataPage.getGraphics2D();
        PDFGraphics2D g2Image = imagePage.getGraphics2D();
        
//       Plot
        XYSeriesCollection dataset = new XYSeriesCollection();
        Plot sin = new Plot();
        sin.sin(dataset);
        JFreeChart chart = ChartFactory.createXYLineChart("plot","x", "y", dataset);
        chart.draw(g2Plot, new Rectangle(0, 0, 612, 468));
        
//        Data
        PDFFrame frame = new PDFFrame();
        frame.setVisible(true);
        JComponent c = (JComponent) frame.getContentPane();
        int w = c.getWidth();
        int h = c.getHeight();
        BufferedImage dataImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D img2 = dataImage.createGraphics();
        frame.getContentPane().paint(img2);
        g2Data.drawImage(dataImage, 0, 0, null); 
        
//        Image
        Object o = new Object();
        InputStream resource = o.getClass().getResourceAsStream("/Łobrazki/image.png");
		try {
		BufferedImage image = ImageIO.read(resource);
		g2Image.drawImage(image, 0, 0, null);
		} catch (IOException e) {
		System.err.println("Blad odczytu obrazka");
		e.printStackTrace();
		}
		List<Linia> linie = new ArrayList<Linia>();		
		for (int i = 1; i<10 ; i++) 
			linie.add( new Linia(r.nextInt(750), r.nextInt(1100), r.nextInt(100), r.nextInt(100), new Color ((int) r.nextLong(), true) ));
		for (Linia ln : linie) {
			ln.paint( g2Image );
		}
		List<Elipsa> elipsy = new ArrayList<Elipsa>();		
		for (int i = 1; i<10 ; i++) 
			elipsy.add( new Elipsa(r.nextInt(750), r.nextInt(1100), r.nextInt(100), r.nextInt(100), new Color ((int) r.nextLong(), true) ));
		for (Elipsa el : elipsy) {
			el.paint( g2Image );
		} 
		
        
        File file = new File("Lab9.pdf");
        pdfDoc.writeToFile(file);
        System.out.println("Adres pliku: " + file.getAbsolutePath());
	}

}
