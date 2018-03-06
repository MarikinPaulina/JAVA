package lab3;

public class Trojkat implements Figura {

	Trojkat(double d1, double d2, double d3)
	{
		dlugoscBoku1 = d1;
		dlugoscBoku2 = d2;
		dlugoscBoku3 = d3;
	}
	@Override
	public double obliczPole() {
		double p = (dlugoscBoku1 + dlugoscBoku2 + dlugoscBoku3)/2;
		double P = Math.sqrt(p*(p-dlugoscBoku1)*(p-dlugoscBoku2)*(p-dlugoscBoku3));
		return P;
	}

	@Override
	public double obliczObwod() {
		double O = dlugoscBoku1 + dlugoscBoku2 + dlugoscBoku3;
		return O;
	}

	double dlugoscBoku1;
	double dlugoscBoku2;
	double dlugoscBoku3;
}
