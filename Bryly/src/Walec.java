
public class Walec extends PktMat{
	private double r = 2;			// promien walca
	private double wsp = 0.5;		// wspolczynnik wystepujacy przy liczeniu momentu glownego
	public double moment() {		// przeciazona metoda obliczenia momentu glownego
		return this.m * wsp * r * r ;
	}
	public Walec(double n) { 		// konstruktor super klasy
		super(n);
	}
	public void opis() {			// przeciazona metoda opisowa
		System.out.println("Walec");
		super.opis();
	}
}
