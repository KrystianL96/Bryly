
public class Pret	extends PktMat {
	private double l = 2;			// dlugosc preta
	private double wsp = 0.083;		// wspolczynnik wystepujacy przy liczeniu momentu glownego
	public double moment() {		// przeciazona metoda obliczenia momentu glownego
		return this.m * wsp * l * l ;
	}
	public Pret(double n) { 		// konstruktor super klasy
		super(n);
	}
	public void opis() {			// przeciazona metoda opisowa
		System.out.println("Pret");
		super.opis();
	}
}
