package pl.edu.pw.fizyka.java.lab7.zadanie2;

public class Gif implements Runnable {

	String[] zrodla;
	PanelRysowania p;
	int n;
	int i = 0;
	boolean isUp = true;
	
	public Gif(PanelRysowania p, String[] zrodla, int n) {
		this.zrodla = zrodla;
		this.p = p;
		this.n = n;
	}
	
	public Gif(PanelRysowania p, int n) {
		this.zrodla = new String[5];
		zrodla[0] = "/Łobrazki/obrazek0.png";
		zrodla[1] = "/Łobrazki/obrazek1.png";
		zrodla[2] = "/Łobrazki/obrazek2.png";
		zrodla[3] = "/Łobrazki/obrazek3.png";
		zrodla[4] = "/Łobrazki/obrazek4.png";
		this.p = p;
		this.n = n;
	}

	public void run() {
		p.dodajŁobrazek(zrodla[i], p.prostakaty.get(n));
		if(isUp)
		{
			i++;
			if(i==4)
			{
				isUp = false;
			}
		}
		else
		{
			i--;
			if(i==0)
			{
				isUp = true;
			}
		}
	}

}
