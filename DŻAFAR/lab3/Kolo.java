package lab3;

public class Kolo implements Figura {

	Kolo(double p)
	{
		promien = p;
	}
	@Override
	public double obliczPole() {
		double P = PI*promien*promien;
		return P;
	}

	@Override
	public double obliczObwod() {
		double O = 2*PI*promien;
		return O;
	}

	double promien;

}
