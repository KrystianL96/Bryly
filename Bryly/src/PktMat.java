public class PktMat {
	protected double m;
	protected double d;
	public PktMat() { //konstruktor domyślny
	this.m = 10;
	}
	public PktMat(double masa ) { //konstruktor z parametrem
	this.m = masa;
	}
	public void setMasa(double a) { //akcesor typu set
	this.m=a;
	}
	public double getMasa() { //akcesor typu get
	return m;
	}
	public void opis() { //podanie informacji o punkcie materialnym
	System.out.format("Masa: %f%n", m);
	System.out.format("Główny moment bezwładności: %f%n", moment());
	System.out.format("Moment bezwładności względem zmienionej osi: %f\n\n",
	steiner(d));
	}
	public double moment () { //obliczenie głównego momentu bezwładności = 0
	return 0;
	}
	public double steiner(double od) { //obliczenie momentu bezwładności względem zmienionej osi
	this.d = od;
	return moment() + m*d*d;
	}
}

