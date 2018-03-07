package lab3;

public class Kolo implements Figura 
{
	Kolo(double p)
	{
		promien = p;
	}

	public double obliczObwod() {
		double O = 2*this.PI*promien;
		return O;
	}

	public double obliczPole() {
		double P = this.PI*promien*promien;
		return P;
	}

	double promien;

}
