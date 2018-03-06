package lab3;

public class ZadanieA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kolo k = new Kolo(3);
		Trojkat t = new Trojkat(2,5,4);
		System.out.println("Pole kola: " + k.obliczPole());
		System.out.println("Obwod kola: " + k.obliczObwod());
		System.out.println("Pole trojkata: " + t.obliczPole());
		System.out.println("Obwod trojkata: " + t.obliczObwod());

	}

}
