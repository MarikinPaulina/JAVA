package pl.edu.pw.fizyka.java.lab7.zadanie2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Prostokat{

	public Prostokat(){}
	
	public Prostokat(PanelRysowania panel)
	{
		this.panel = panel;
	}
	
    private int xPos = 50;
	private int yPos = 50;
    private int width = 20;
    private int height = 20;
    private Color color = Color.BLACK;
    int vx;
    int vy;
    BufferedImage image;
    PanelRysowania panel;
    
    public int getX() {
		return xPos;
	}

	public void setX(int xPos) {
		this.xPos = xPos;
	}

    public void setY(int yPos){
        this.yPos = yPos;
    }

    public int getY(){
        return yPos;
    }

    public int getWidth(){
        return width;
    } 

    public int getHeight(){
        return height;
    }


	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

    public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void paint(Graphics g){
		if(image == null)
		{
			 g.setColor(getColor());
		     g.fillRect(xPos,yPos,getWidth(),getHeight());
		}
		else
		{
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(image, xPos, yPos, panel);
		}
    }

}
