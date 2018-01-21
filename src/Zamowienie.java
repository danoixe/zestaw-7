
public class Zamowienie {
	
	int ileDodanych=0;
	int maksRozmiar;
	Pozycje[] tab;
	
	public Zamowienie() {
		this(10);
	}
	
	public Zamowienie(int max) {
		maksRozmiar=max;
		tab = new Pozycje[maksRozmiar];
	}
	
	
	public void dodajPozycje(Pozycje p) {
	
		tab[ileDodanych++]=p;
		}
	
	public double obliczWartosc() {
		double wartosc=0;
		for(int i=0; i<ileDodanych; i++) {
			wartosc+=tab[i].obliczWartosc();
		}
		return wartosc;
	}
	
	public String toString() {
		String linia="Zamówienie: \n ";
		for (int i=0; i<ileDodanych; i++) {
			linia+=tab[i]+"\n";		
			}
		linia+=String.format("Razem: "+"%.2f"+" z³", obliczWartosc());
		return linia;
	}
	
	void usunPozycje(int indeks) {
		for (int i=indeks; i<tab.length-1; i++) {
			tab[i]=tab[i+1];
		}
		ileDodanych--;
	}
	

}


	

