
public class Kula extends PktMat {
	private double r = 2;			// promien kuli
	private double wsp = 0.4;		// wspolczynnik wystepujacy przy liczeniu momentu glownego
	public double moment() {		// przeciazona metoda obliczenia momentu glownego
		return this.m*wsp* r * r ;
	}
	public Kula(double n) { 		// konstruktor super klasy
		super(n);
	}
	public void opis() {			// przeciazona metoda opisowa
		System.out.println("Kula");
		super.opis();
	}
}
