public class test {
	
		public static void main(String[] args) {
			
			// tworzenie obiektu walca, wyliczenie jego glownego i zmienionego momentu bezwladnosci oraz opis
			Walec walec = new Walec(4);
			walec.moment();
			walec.steiner(2);
			walec.opis();
			
			// tworzenie obiektu kuli, wyliczenie jej glownego i zmienionego momentu bezwladnosci oraz opis
			Kula kula = new Kula(4);
			kula.moment();
			kula.steiner(2);
			kula.opis();

			// tworzenie obiektu preta, wyliczenie jego glownego i zmienionego momentu bezwladnosci oraz opis				
			Pret pret = new Pret(4);
			pret.moment();
			pret.steiner(2);
			pret.opis();
			
			// tworzenie tablicy obiektów walca i jej elementow
			Walec[] walce = new Walec[5];
			for ( int i = 0; i< 5; i++) {
				Walec walec1 = new Walec(i+1);
				walce[i] = walec1;
			}
			
			// obliczenie nowego momentu bezwladnosci i opis dla walcow
			for ( int i = 0; i< 5; i++) {
				walce[i].steiner(2);
				walce[i].opis();
			}
			
			// tworzenie tablicy obiektów kuli i jej elementow
			Kula[] kule = new Kula[5];
			for ( int i = 0; i< 5; i++) {
				Kula kula1 = new Kula(i+1);
				kule[i] = kula1;
			}
			
			// obliczenie nowego momentu bezwladnosci i opis dla kul
			for ( int i = 0; i< 5; i++) {
				kule[i].steiner(2);
				kule[i].opis();
			}
			
			// tworzenie tablicy obiektów preta i jej elementow
			Pret[] prety = new Pret[5];
			for ( int i = 0; i< 5; i++) {
				Pret pret1 = new Pret(i+1);
				prety[i] = pret1;
			}
			
			// obliczenie nowego momentu bezwladnosci i opis dla pretow
			for ( int i = 0; i< 5; i++) {
				prety[i].steiner(2);
				prety[i].opis();		
		
			}
		}
}

	




